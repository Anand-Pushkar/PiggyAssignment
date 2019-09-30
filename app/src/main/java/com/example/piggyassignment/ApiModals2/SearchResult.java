
package com.example.piggyassignment.ApiModals2;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class SearchResult implements Serializable {

    @SerializedName("amc")
    private String mAmc;
    @SerializedName("asset_aum")
    private String mAssetAum;
    @SerializedName("category")
    private String mCategory;
    @SerializedName("details_id")
    private String mDetailsId;
    @SerializedName("id")
    private Long mId;
    @SerializedName("minimum_investment")
    private Double mMinimumInvestment;
    @SerializedName("name")
    private String mName;
    @SerializedName("rating")
    private Long mRating;
    @SerializedName("return_3yr")
    private Double mReturn3Yr;
    @SerializedName("return_5yr")
    private Double mReturn5Yr;
    @SerializedName("return_from_beginning")
    private Double mReturnFromBeginning;
    @SerializedName("riskometer")
    private String mRiskometer;
    @SerializedName("sub_category")
    private String mSubCategory;
    @SerializedName("url_name")
    private Object mUrlName;
    @SerializedName("yoy_return")
    private Double mYoyReturn;

    public String getAmc() {
        return mAmc;
    }

    public void setAmc(String amc) {
        mAmc = amc;
    }

    public String getAssetAum() {
        return mAssetAum;
    }

    public void setAssetAum(String assetAum) {
        mAssetAum = assetAum;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public String getDetailsId() {
        return mDetailsId;
    }

    public void setDetailsId(String detailsId) {
        mDetailsId = detailsId;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Double getMinimumInvestment() {
        return mMinimumInvestment;
    }

    public void setMinimumInvestment(Double minimumInvestment) {
        mMinimumInvestment = minimumInvestment;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getRating() {
        return mRating;
    }

    public void setRating(Long rating) {
        mRating = rating;
    }

    public double getReturn3Yr() {
        return mReturn3Yr;
    }

    public void setReturn3Yr(Double return3Yr) {
        mReturn3Yr = return3Yr;
    }

    public double getReturn5Yr() {
        return mReturn5Yr;
    }

    public void setReturn5Yr(Double return5Yr) {
        mReturn5Yr = return5Yr;
    }

    public Double getReturnFromBeginning() {
        return mReturnFromBeginning;
    }

    public void setReturnFromBeginning(Double returnFromBeginning) {
        mReturnFromBeginning = returnFromBeginning;
    }

    public String getRiskometer() {
        return mRiskometer;
    }

    public void setRiskometer(String riskometer) {
        mRiskometer = riskometer;
    }

    public String getSubCategory() {
        return mSubCategory;
    }

    public void setSubCategory(String subCategory) {
        mSubCategory = subCategory;
    }

    public Object getUrlName() {
        return mUrlName;
    }

    public void setUrlName(Object urlName) {
        mUrlName = urlName;
    }

    public double getYoyReturn() {
        return mYoyReturn;
    }

    public void setYoyReturn(Double yoyReturn) {
        mYoyReturn = yoyReturn;
    }

}
