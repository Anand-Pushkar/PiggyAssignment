
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Content implements Serializable {

    @SerializedName("fund_info")
    private String mFundInfo;
    @SerializedName("fund_performance")
    private String mFundPerformance;
    @SerializedName("portfolio_info")
    private String mPortfolioInfo;
    @SerializedName("suitability")
    private String mSuitability;

    public String getFundInfo() {
        return mFundInfo;
    }

    public void setFundInfo(String fundInfo) {
        mFundInfo = fundInfo;
    }

    public String getFundPerformance() {
        return mFundPerformance;
    }

    public void setFundPerformance(String fundPerformance) {
        mFundPerformance = fundPerformance;
    }

    public String getPortfolioInfo() {
        return mPortfolioInfo;
    }

    public void setPortfolioInfo(String portfolioInfo) {
        mPortfolioInfo = portfolioInfo;
    }

    public String getSuitability() {
        return mSuitability;
    }

    public void setSuitability(String suitability) {
        mSuitability = suitability;
    }

}
