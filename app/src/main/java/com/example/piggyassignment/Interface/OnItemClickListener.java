package com.example.piggyassignment.Interface;

import com.example.piggyassignment.ApiModals2.SearchResult;

import java.util.ArrayList;

public interface OnItemClickListener {

    boolean onItemClick(SearchResult searchResult , boolean checked);
    //ArrayList<SearchResult> getChecked();
}
