package com.example.piggyassignment.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.piggyassignment.ApiModals.MutualFund;
import com.example.piggyassignment.ApiModals2.SearchResult;
import com.example.piggyassignment.Interface.OnItemClickListener;
import com.example.piggyassignment.Modals.CheckboxStatus;
import com.example.piggyassignment.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MutualFundAdapter extends RecyclerView.Adapter<MutualFundAdapter.MutualFundViewHolder> implements Filterable {

    public static final String TAG = "MutualFundAdapter";

    public int flag;
    public long id1, id2, id;

    private Context context;
    private ArrayList<SearchResult> searchResultArrayList;
    private ArrayList<SearchResult> searchResultsAllArrayList;

    ArrayList<SearchResult> fundComparisonArrayList = new ArrayList<>();

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){

        this.onItemClickListener = onItemClickListener;
    }

    //Constructor
    public MutualFundAdapter(Context context, ArrayList<SearchResult> searchResultArrayList) {
        Log.d(TAG, "MutualFundAdapter: ");
        this.context = context;
        this.searchResultArrayList = new ArrayList<>(searchResultArrayList);
        Log.d(TAG, "MutualFundAdapter: " + this.searchResultArrayList.size());
    }

    public void updateSearchResults(ArrayList<SearchResult> searchResults){

        Log.d(TAG, "updateSearchResults: ");
        this.searchResultArrayList = searchResults;
        this.searchResultsAllArrayList = new ArrayList<>(searchResults);
        notifyDataSetChanged();

        Log.d(TAG, "updateSearchResults: " + searchResults.size());
    }



    @NonNull
    @Override
    public MutualFundAdapter.MutualFundViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        Log.d(TAG, "onCreateViewHolder: ");

        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.list_item_mutual_funds, viewGroup, false);

        return new MutualFundViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MutualFundAdapter.MutualFundViewHolder mutualFundViewHolder, final int position) {

        Log.d(TAG, "onBindViewHolder: ");

        final SearchResult thisResult = searchResultArrayList.get(mutualFundViewHolder.getAdapterPosition());

        String yr1, yr3, yr5, min_sub;

        yr1 = Double.toString(thisResult.getYoyReturn()) + context.getString(R.string.percentage);
        yr3 = Double.toString(thisResult.getReturn3Yr()) + context.getString(R.string.percentage);
        yr5 = Double.toString(thisResult.getReturn5Yr()) + context.getString(R.string.percentage);
        min_sub = context.getString(R.string.Rs) + Double.toString(thisResult.getMinimumInvestment());

        mutualFundViewHolder.tvMfName.setText(thisResult.getName());
        mutualFundViewHolder.tvCategory.setText(thisResult.getCategory().toUpperCase());
        mutualFundViewHolder.tv1yr.setText(yr1);
        mutualFundViewHolder.tv3yr.setText(yr3);
        mutualFundViewHolder.tv5yr.setText(yr5);
        mutualFundViewHolder.tvMinimumSubscription.setText(min_sub);


        mutualFundViewHolder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onItemClickListener != null){

                    boolean checked = mutualFundViewHolder.checkBox.isChecked();
                    Log.d(TAG, "onClick: " + checked);
                    boolean enable = onItemClickListener.onItemClick(thisResult , checked);

                    if(!enable){
                        mutualFundViewHolder.checkBox.setChecked(enable);
                    }

                    fundComparisonArrayList = onItemClickListener.getChecked();
                    if(fundComparisonArrayList.size() == 2){
                        id1 = fundComparisonArrayList.get(0).getId();
                        id2 = fundComparisonArrayList.get(1).getId();
                    }
                    else if(fundComparisonArrayList.size() == 1){
                        id = fundComparisonArrayList.get(0).getId();
                    }

                    Log.d(TAG, "onClick: fundComparisonArrayList.size = " + fundComparisonArrayList.size());
                }
            }
        });

        if(fundComparisonArrayList.size() == 2){
            flag = 2;
        }
        else if(fundComparisonArrayList.size() == 1){
            flag = 1;
        }
        else {
            flag = 0;
        }
    }

    @Override
    public void onViewRecycled(@NonNull MutualFundViewHolder holder) {
        super.onViewRecycled(holder);

        SearchResult thisResult = searchResultArrayList.get(holder.getAdapterPosition());
        //Log.d(TAG, "&&&&&&&&&&&&&&&&& onViewRecycled: holder.getAdapterPosition()" + holder.getAdapterPosition());

        Log.d(TAG, "onViewRecycled: this Result + " + thisResult.getId());
        Log.d(TAG, "onViewRecycled: " + holder.checkBox.isChecked());

        if(flag == 1) {
            if (thisResult.getId().equals(id)) {
                holder.checkBox.setChecked(true);
                Log.d(TAG, "onViewRecycled: id = " + id);
                Log.d(TAG, "onViewRecycled: thisResult" + thisResult.getId());
            } else {
                holder.checkBox.setChecked(false);
            }
        }
        else if(flag == 2){
            if(thisResult.getId().equals(id1) || thisResult.getId().equals(id2)){
                holder.checkBox.setChecked(true);
                Log.d(TAG, "onViewRecycled: id1 = " + id1);
                Log.d(TAG, "onViewRecycled: id2 = " + id2);
                Log.d(TAG, "onViewRecycled: thisResult" + thisResult.getId());
            }
            else{
                holder.checkBox.setChecked(false);
            }
        }
        else{
            holder.checkBox.setChecked(false);
        }

    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: " + searchResultArrayList.size());
        return searchResultArrayList.size();
    }

    Filter filter = new Filter() {

        //run on background thread
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            Log.d(TAG, "performFiltering: filtering started");

            ArrayList<SearchResult> filteredResult = new ArrayList<>();

            if(constraint.toString().isEmpty()){
                Log.d(TAG, "performFiltering: empty search bar " + searchResultsAllArrayList.size());
                filteredResult.addAll(searchResultsAllArrayList);
            }
            else {

                for(SearchResult result: searchResultsAllArrayList){

                    if(result.getName().toLowerCase().contains(constraint.toString().toLowerCase())){

                        filteredResult.add(result);

                    }
                }
            }

            FilterResults filterResults = new FilterResults();
            filterResults.values = filteredResult;

            return filterResults;
        }

        //run on UI thread
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            Log.d(TAG, "publishResults: result publishing started");

            searchResultArrayList.clear();
            searchResultArrayList.addAll((Collection<? extends SearchResult>) results.values);
            notifyDataSetChanged();
            Log.d(TAG, "publishResults: filtered result published");
        }
    };

    @Override
    public Filter getFilter() {
        Log.d(TAG, "getFilter: ");
        return filter;
    }

    public class MutualFundViewHolder extends RecyclerView.ViewHolder {

        TextView tvMfName, tvCategory, tv1yr, tv3yr, tv5yr, tvMinimumSubscription;
        CheckBox checkBox;

        public MutualFundViewHolder(@NonNull View itemView) {
            super(itemView);

            tvMfName = (TextView)itemView.findViewById(R.id.tv_mf_name);
            tvCategory = (TextView)itemView.findViewById(R.id.tv_category);
            tv1yr = (TextView)itemView.findViewById(R.id.tv_1yr);
            tv3yr = (TextView)itemView.findViewById(R.id.tv_3yr);
            tv5yr = (TextView)itemView.findViewById(R.id.tv_5yr);
            tvMinimumSubscription = (TextView)itemView.findViewById(R.id.tv_minimum_subscription);
            checkBox = (CheckBox) itemView.findViewById(R.id.cb_status);
        }
    }
}
