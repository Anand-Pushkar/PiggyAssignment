
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class MutualFund implements Serializable {

    @SerializedName("amc_fund_code")
    private Object mAmcFundCode;
    @SerializedName("amc_scheme_code")
    private Object mAmcSchemeCode;
    @SerializedName("amc_scheme_plan")
    private Object mAmcSchemePlan;
    @SerializedName("amc_scheme_plan_code")
    private Object mAmcSchemePlanCode;
    @SerializedName("best_return")
    private BestReturn mBestReturn;
    @SerializedName("cams_code")
    private String mCamsCode;
    @SerializedName("date")
    private String mDate;
    @SerializedName("details")
    private Details mDetails;
    @SerializedName("dividend_type")
    private String mDividendType;
    @SerializedName("dividend_type_text")
    private String mDividendTypeText;
    @SerializedName("expense_ratio")
    private Double mExpenseRatio;
    @SerializedName("is_instant_redeemable")
    private Boolean mIsInstantRedeemable;
    @SerializedName("key")
    private String mKey;
    @SerializedName("last_day_date")
    private String mLastDayDate;
    @SerializedName("last_day_nav")
    private Double mLastDayNav;
    @SerializedName("launch_date")
    private String mLaunchDate;
    @SerializedName("maximum_instant_redeem_amount")
    private Double mMaximumInstantRedeemAmount;
    @SerializedName("minimum_instant_redeem_amount")
    private Double mMinimumInstantRedeemAmount;
    @SerializedName("money_control_code")
    private String mMoneyControlCode;
    @SerializedName("nav")
    private Double mNav;
    @SerializedName("nav_change_percentage")
    private Double mNavChangePercentage;
    @SerializedName("nav_refresh_date")
    private String mNavRefreshDate;
    @SerializedName("plan_type")
    private String mPlanType;
    @SerializedName("scheme_id")
    private String mSchemeId;

    public Object getAmcFundCode() {
        return mAmcFundCode;
    }

    public void setAmcFundCode(Object amcFundCode) {
        mAmcFundCode = amcFundCode;
    }

    public Object getAmcSchemeCode() {
        return mAmcSchemeCode;
    }

    public void setAmcSchemeCode(Object amcSchemeCode) {
        mAmcSchemeCode = amcSchemeCode;
    }

    public Object getAmcSchemePlan() {
        return mAmcSchemePlan;
    }

    public void setAmcSchemePlan(Object amcSchemePlan) {
        mAmcSchemePlan = amcSchemePlan;
    }

    public Object getAmcSchemePlanCode() {
        return mAmcSchemePlanCode;
    }

    public void setAmcSchemePlanCode(Object amcSchemePlanCode) {
        mAmcSchemePlanCode = amcSchemePlanCode;
    }

    public BestReturn getBestReturn() {
        return mBestReturn;
    }

    public void setBestReturn(BestReturn bestReturn) {
        mBestReturn = bestReturn;
    }

    public String getCamsCode() {
        return mCamsCode;
    }

    public void setCamsCode(String camsCode) {
        mCamsCode = camsCode;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public Details getDetails() {
        return mDetails;
    }

    public void setDetails(Details details) {
        mDetails = details;
    }

    public String getDividendType() {
        return mDividendType;
    }

    public void setDividendType(String dividendType) {
        mDividendType = dividendType;
    }

    public String getDividendTypeText() {
        return mDividendTypeText;
    }

    public void setDividendTypeText(String dividendTypeText) {
        mDividendTypeText = dividendTypeText;
    }

    public Double getExpenseRatio() {
        return mExpenseRatio;
    }

    public void setExpenseRatio(Double expenseRatio) {
        mExpenseRatio = expenseRatio;
    }

    public Boolean getIsInstantRedeemable() {
        return mIsInstantRedeemable;
    }

    public void setIsInstantRedeemable(Boolean isInstantRedeemable) {
        mIsInstantRedeemable = isInstantRedeemable;
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        mKey = key;
    }

    public String getLastDayDate() {
        return mLastDayDate;
    }

    public void setLastDayDate(String lastDayDate) {
        mLastDayDate = lastDayDate;
    }

    public Double getLastDayNav() {
        return mLastDayNav;
    }

    public void setLastDayNav(Double lastDayNav) {
        mLastDayNav = lastDayNav;
    }

    public String getLaunchDate() {
        return mLaunchDate;
    }

    public void setLaunchDate(String launchDate) {
        mLaunchDate = launchDate;
    }

    public Double getMaximumInstantRedeemAmount() {
        return mMaximumInstantRedeemAmount;
    }

    public void setMaximumInstantRedeemAmount(Double maximumInstantRedeemAmount) {
        mMaximumInstantRedeemAmount = maximumInstantRedeemAmount;
    }

    public Double getMinimumInstantRedeemAmount() {
        return mMinimumInstantRedeemAmount;
    }

    public void setMinimumInstantRedeemAmount(Double minimumInstantRedeemAmount) {
        mMinimumInstantRedeemAmount = minimumInstantRedeemAmount;
    }

    public String getMoneyControlCode() {
        return mMoneyControlCode;
    }

    public void setMoneyControlCode(String moneyControlCode) {
        mMoneyControlCode = moneyControlCode;
    }

    public Double getNav() {
        return mNav;
    }

    public void setNav(Double nav) {
        mNav = nav;
    }

    public Double getNavChangePercentage() {
        return mNavChangePercentage;
    }

    public void setNavChangePercentage(Double navChangePercentage) {
        mNavChangePercentage = navChangePercentage;
    }

    public String getNavRefreshDate() {
        return mNavRefreshDate;
    }

    public void setNavRefreshDate(String navRefreshDate) {
        mNavRefreshDate = navRefreshDate;
    }

    public String getPlanType() {
        return mPlanType;
    }

    public void setPlanType(String planType) {
        mPlanType = planType;
    }

    public String getSchemeId() {
        return mSchemeId;
    }

    public void setSchemeId(String schemeId) {
        mSchemeId = schemeId;
    }

}
