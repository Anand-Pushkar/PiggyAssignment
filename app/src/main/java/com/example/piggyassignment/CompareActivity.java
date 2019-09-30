package com.example.piggyassignment;

import android.accounts.AbstractAccountAuthenticator;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.piggyassignment.API.GetMutualFundAPI;
import com.example.piggyassignment.API.SearchAPI;
import com.example.piggyassignment.ApiModals.Root;
import com.example.piggyassignment.ApiModals2.PostRequestBody;
import com.example.piggyassignment.ApiModals2.Root2;
import com.example.piggyassignment.ApiModals2.SearchResult;

import java.io.Serializable;
import java.util.ArrayList;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CompareActivity extends Activity {

    public static final String TAG = "CompareActivity";


    ArrayList<SearchResult> funds = new ArrayList<>();
    private GetMutualFundAPI getMutualFundAPI;
    TextView tvName1, tvName2, tvSt1, tvSt2,tvNav1, tvNav2, tvL1_1, tvL1_2, tvL3_1, tvL3_2,
            tvL5_1, tvL5_2, tvMinSub1, tvMinSub2, tv_ms1, tv_ms2, tv_risk1, tv_risk2, tv_rating1, tv_rating2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);

        tvName1 = (TextView) findViewById(R.id.tv_name_1);
        tvName2 = (TextView) findViewById(R.id.tv_name_2);
        tvSt1 = (TextView) findViewById(R.id.tv_st1);
        tvSt2 = (TextView) findViewById(R.id.tv_st2);
//        tvNav1 = (TextView) findViewById(R.id.tv_nav1);
//        tvNav2 = (TextView) findViewById(R.id.tv_nav2);
        tvL1_1 = (TextView) findViewById(R.id.tv_l1_1);
        tvL1_2 = (TextView) findViewById(R.id.tv_l1_2);
        tvL3_1 = (TextView) findViewById(R.id.tv_l3_1);
        tvL3_2 = (TextView) findViewById(R.id.tv_l3_2);
        tvL5_1 = (TextView) findViewById(R.id.tv_l5_1);
        tvL5_2 = (TextView) findViewById(R.id.tv_l5_2);
//        tvExp1 = (TextView) findViewById(R.id.tv_exp1);
//        tvExp2 = (TextView) findViewById(R.id.tv_exp2);
        tv_risk1 = (TextView) findViewById(R.id.tv_risk1);
        tv_risk2 = (TextView) findViewById(R.id.tv_risk2);
        tv_rating1 = (TextView) findViewById(R.id.tv_rating1);
        tv_rating2 = (TextView) findViewById(R.id.tv_rating2);

        tvMinSub1 = (TextView) findViewById(R.id.tv_min_sub_1);
        tvMinSub2 = (TextView) findViewById(R.id.tv_min_sub_2);



        SearchResult sr1 = (SearchResult)getIntent().getSerializableExtra("mf1");
        SearchResult sr2 = (SearchResult)getIntent().getSerializableExtra("mf2");

        Log.d(TAG, "onCreate: mf1 : " + sr1.getName());
        Log.d(TAG, "onCreate: mf2 : " + sr2.getName());

        setData(sr1, sr2);

    }

    public void setData(SearchResult s1, SearchResult s2){
        Log.d(TAG, "setData: ");


        String yr1_1 = Double.toString(s1.getYoyReturn()) + this.getString(R.string.percentage);
        String yr3_1 = Double.toString(s1.getReturn3Yr()) + this.getString(R.string.percentage);
        String yr5_1 = Double.toString(s1.getReturn5Yr()) + this.getString(R.string.percentage);
        String min_sub_1 = this.getString(R.string.Rs) + Double.toString(s1.getMinimumInvestment());
        String r1 = Double.toString(s1.getRating());


        String yr1_2 = Double.toString(s2.getYoyReturn()) + this.getString(R.string.percentage);
        String yr3_2 = Double.toString(s2.getReturn3Yr()) + this.getString(R.string.percentage);
        String yr5_2 = Double.toString(s2.getReturn5Yr()) + this.getString(R.string.percentage);
        String min_sub_2 = this.getString(R.string.Rs) + Double.toString(s2.getMinimumInvestment());
        String r2 = Double.toString(s2.getRating());

        tvName1.setText(s1.getName());
        tvName2.setText(s2.getName());

        tvSt1.setText(s1.getCategory());
        tvSt2.setText(s2.getCategory());

        tvL1_1.setText(yr1_1);
        tvL1_2.setText(yr1_2);

        tvL3_1.setText(yr3_1);
        tvL3_2.setText(yr3_2);

        tvL5_1.setText(yr5_1);
        tvL5_2.setText(yr5_2);

        tvMinSub1.setText(min_sub_1);
        tvMinSub2.setText(min_sub_2);

        tv_risk1.setText(s1.getRiskometer());
        tv_risk2.setText(s2.getRiskometer());

        tv_rating1.setText(r1);
        tv_rating2.setText(r2);

    }


}
