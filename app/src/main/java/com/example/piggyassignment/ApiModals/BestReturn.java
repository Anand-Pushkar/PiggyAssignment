
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class BestReturn implements Serializable {

    @SerializedName("fromdate")
    private String mFromdate;
    @SerializedName("percent_change")
    private Double mPercentChange;
    @SerializedName("todate")
    private String mTodate;

    public String getFromdate() {
        return mFromdate;
    }

    public void setFromdate(String fromdate) {
        mFromdate = fromdate;
    }

    public Double getPercentChange() {
        return mPercentChange;
    }

    public void setPercentChange(Double percentChange) {
        mPercentChange = percentChange;
    }

    public String getTodate() {
        return mTodate;
    }

    public void setTodate(String todate) {
        mTodate = todate;
    }

}
