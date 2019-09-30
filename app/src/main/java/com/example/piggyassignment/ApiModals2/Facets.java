
package com.example.piggyassignment.ApiModals2;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class Facets implements Serializable {

    @SerializedName("amc")
    private List<Amc> mAmc;
    @SerializedName("category")
    private List<Category> mCategory;
    @SerializedName("riskometer")
    private List<Riskometer> mRiskometer;
    @SerializedName("sub_category")
    private List<SubCategory> mSubCategory;

    public List<Amc> getAmc() {
        return mAmc;
    }

    public void setAmc(List<Amc> amc) {
        mAmc = amc;
    }

    public List<Category> getCategory() {
        return mCategory;
    }

    public void setCategory(List<Category> category) {
        mCategory = category;
    }

    public List<Riskometer> getRiskometer() {
        return mRiskometer;
    }

    public void setRiskometer(List<Riskometer> riskometer) {
        mRiskometer = riskometer;
    }

    public List<SubCategory> getSubCategory() {
        return mSubCategory;
    }

    public void setSubCategory(List<SubCategory> subCategory) {
        mSubCategory = subCategory;
    }

}
