package com.example.piggyassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

import com.example.piggyassignment.API.SearchAPI;
import com.example.piggyassignment.Adapters.MutualFundAdapter;
import com.example.piggyassignment.ApiModals2.PostRequestBody;
import com.example.piggyassignment.ApiModals2.Root2;
import com.example.piggyassignment.ApiModals2.SearchResult;
import com.example.piggyassignment.Interface.OnItemClickListener;
import com.example.piggyassignment.Modals.CheckboxStatus;

import java.io.Serializable;
import java.util.ArrayList;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    Button btnCompare;
    private SearchAPI searchAPI;
    RecyclerView rvMutualFund;
    MutualFundAdapter mutualFundAdapter;
    public ArrayList<SearchResult> fundComparisonArrayList = new ArrayList<>();
    public ArrayList<CheckboxStatus> checkboxStatusArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMutualFund = (RecyclerView) findViewById(R.id.rv_mutual_funds);
        btnCompare = (Button)findViewById(R.id.btn_compare);

        rvMutualFund.setLayoutManager(new LinearLayoutManager(this));
        mutualFundAdapter = new MutualFundAdapter(this, new ArrayList<SearchResult>());
        rvMutualFund.setAdapter(mutualFundAdapter);
        Log.d(TAG, "onCreate: adapter set");


        mutualFundAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public boolean onItemClick(SearchResult searchResult , boolean checked) {

                Log.d(TAG, "onItemClick: " + searchResult.getId());


                if(fundComparisonArrayList.size() < 2){

                    if(checked){
                        int count = 0;
                        for(int i = 0 ; i < fundComparisonArrayList.size() ; i++){

                            if(searchResult.getId() == fundComparisonArrayList.get(i).getId()){
                                count++;
                                break;
                            }
                        }

                        if(count == 0){
                            fundComparisonArrayList.add(searchResult);
                            Toast.makeText(getApplicationContext(),"Mutual Fund selected to be compared",Toast.LENGTH_SHORT).show();
                            Log.d(TAG, "onItemClick: added " + searchResult.getId());
                            Log.d(TAG, "onItemClick: " + fundComparisonArrayList.size());
                            return true;
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Select a different fund",Toast.LENGTH_SHORT).show();
                            Log.d(TAG, "onItemClick: " + fundComparisonArrayList.size());
                            return false;
                        }
                    }
                    else {
                        int count = 0;
                        for(int i = 0 ; i < fundComparisonArrayList.size() ; i++){

                            if(searchResult.getId() == fundComparisonArrayList.get(i).getId()){
                                count++;
                                break;
                            }
                        }

                        if(count == 0){
                            return false;
                        }
                        else {
                            fundComparisonArrayList.remove(searchResult);
                            Log.d(TAG, "onItemClick: removed " + searchResult);
                            Log.d(TAG, "onItemClick: " + fundComparisonArrayList.size());
                            return false;
                        }

                    }
                }
                else if(fundComparisonArrayList.size() == 2){

                    if(checked){
                        Toast.makeText(getApplicationContext(),"Cannot compare more than 2 funds",Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "onItemClick: " + fundComparisonArrayList.size());
                        return false;
                    }
                    else {
                        fundComparisonArrayList.remove(searchResult);
                        Log.d(TAG, "onItemClick: removed " + searchResult);
                        Log.d(TAG, "onItemClick: " + fundComparisonArrayList.size());
                        return false;
                    }
                }
                else {
                    return false;
                }
            }

        });


        final ArrayList<Long> id = new ArrayList<>();
        for(int i = 0 ; i < fundComparisonArrayList.size() ; i++){

            id.add(fundComparisonArrayList.get(i).getId());
        }

        btnCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(fundComparisonArrayList.size() == 2){
                    Intent intent = new Intent(MainActivity.this, CompareActivity.class);

                    intent.putExtra("mf1", (Serializable) fundComparisonArrayList.get(0));
                    intent.putExtra("mf2", (Serializable) fundComparisonArrayList.get(1));

                    startActivity(intent);
                }
                else if (fundComparisonArrayList.size() < 2){
                    Toast.makeText(getApplicationContext(),"Cannot compare less than 2 funds",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Cannot compare more than 2 funds",Toast.LENGTH_SHORT).show();
                }
            }
        });

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.piggy.co.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        searchAPI = retrofit.create(SearchAPI.class);

        getSearchResults();
    }

    private void getSearchResults() {
        Log.d(TAG, "getSearchResults: ");


        PostRequestBody postRequestBody = new PostRequestBody("hdfc", 2, 1);

        Call<Root2> call = searchAPI.getSearchResult(postRequestBody);

        call.enqueue(new Callback<Root2>() {
            @Override
            public void onResponse(Call<Root2> call, Response<Root2> response) {

                Log.d(TAG, "onResponse: " + response.code());
                Root2 root2 = response.body();
                ArrayList<SearchResult> searchResults = new ArrayList<>(root2.getData().getSearchResults());
                Log.d(TAG, "onResponse: ##########" + searchResults.size());

                for(int i = 0 ; i < searchResults.size() ; i++){
                    checkboxStatusArrayList.add(new CheckboxStatus(false));
                }

                mutualFundAdapter.updateSearchResults(searchResults, checkboxStatusArrayList);
            }

            @Override
            public void onFailure(Call<Root2> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {

        Log.d(TAG, "onCreateOptionsMenu: ");

        getMenuInflater().inflate(R.menu.main_menu, menu);
        final MenuItem item = menu.findItem(R.id.action_search);

        SearchView searchView = (SearchView) item.getActionView();
        searchView.setQueryHint(getString(R.string.hintSearchMess));


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Log.d(TAG, "onQueryTextSubmit: " + s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                Log.d(TAG, "onQueryTextChange: " + s);
                mutualFundAdapter.getFilter().filter(s);
                //fundComparisonArrayList.clear();
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
