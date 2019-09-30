
package com.example.piggyassignment.ApiModals2;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class Data implements Serializable {

    @SerializedName("facets")
    private Facets mFacets;
    @SerializedName("search_query")
    private String mSearchQuery;
    @SerializedName("search_results")
    private List<SearchResult> mSearchResults;
    @SerializedName("search_results_count")
    private Long mSearchResultsCount;

    public Facets getFacets() {
        return mFacets;
    }

    public void setFacets(Facets facets) {
        mFacets = facets;
    }

    public String getSearchQuery() {
        return mSearchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        mSearchQuery = searchQuery;
    }

    public List<SearchResult> getSearchResults() {
        return mSearchResults;
    }

    public void setSearchResults(List<SearchResult> searchResults) {
        mSearchResults = searchResults;
    }

    public Long getSearchResultsCount() {
        return mSearchResultsCount;
    }

    public void setSearchResultsCount(Long searchResultsCount) {
        mSearchResultsCount = searchResultsCount;
    }

}
