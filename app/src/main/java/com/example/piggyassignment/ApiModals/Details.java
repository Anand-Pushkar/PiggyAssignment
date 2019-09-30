
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Details implements Serializable {

    @SerializedName("amc")
    private Amc mAmc;
    @SerializedName("asset_aum")
    private String mAssetAum;
    @SerializedName("benchmark")
    private Benchmark mBenchmark;
    @SerializedName("benchmark_text")
    private String mBenchmarkText;
    @SerializedName("category")
    private String mCategory;
    @SerializedName("content")
    private Content mContent;
    @SerializedName("exit_load")
    private Double mExitLoad;
    @SerializedName("exit_load_text")
    private String mExitLoadText;
    @SerializedName("fund_analysis")
    private Object mFundAnalysis;
    @SerializedName("id")
    private Long mId;
    @SerializedName("is_elss")
    private Boolean mIsElss;
    @SerializedName("minimum_addition_subscription")
    private Double mMinimumAdditionSubscription;
    @SerializedName("minimum_balance_maintainence")
    private Double mMinimumBalanceMaintainence;
    @SerializedName("minimum_redemption")
    private Double mMinimumRedemption;
    @SerializedName("minimum_sip_subscription")
    private Double mMinimumSipSubscription;
    @SerializedName("minimum_subscription")
    private Double mMinimumSubscription;
    @SerializedName("minimum_swp_withdrawal")
    private Double mMinimumSwpWithdrawal;
    @SerializedName("multiple_addition_subscription")
    private Double mMultipleAdditionSubscription;
    @SerializedName("multiple_redemption")
    private Double mMultipleRedemption;
    @SerializedName("multiple_subscription")
    private Double mMultipleSubscription;
    @SerializedName("name")
    private String mName;
    @SerializedName("objective")
    private String mObjective;
    @SerializedName("rating")
    private Long mRating;
    @SerializedName("return_3yr")
    private Double mReturn3Yr;
    @SerializedName("return_5yr")
    private Double mReturn5Yr;
    @SerializedName("riskometer")
    private String mRiskometer;
    @SerializedName("scheme_class")
    private String mSchemeClass;
    @SerializedName("scheme_details_id")
    private String mSchemeDetailsId;
    @SerializedName("scheme_type")
    private String mSchemeType;
    @SerializedName("sid")
    private Object mSid;
    @SerializedName("sid_url")
    private String mSidUrl;
    @SerializedName("suitability")
    private String mSuitability;
    @SerializedName("url_name")
    private String mUrlName;
    @SerializedName("value_research_rank")
    private Object mValueResearchRank;
    @SerializedName("yoy_return")
    private Double mYoyReturn;

    public Amc getAmc() {
        return mAmc;
    }

    public void setAmc(Amc amc) {
        mAmc = amc;
    }

    public String getAssetAum() {
        return mAssetAum;
    }

    public void setAssetAum(String assetAum) {
        mAssetAum = assetAum;
    }

    public Benchmark getBenchmark() {
        return mBenchmark;
    }

    public void setBenchmark(Benchmark benchmark) {
        mBenchmark = benchmark;
    }

    public String getBenchmarkText() {
        return mBenchmarkText;
    }

    public void setBenchmarkText(String benchmarkText) {
        mBenchmarkText = benchmarkText;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public Content getContent() {
        return mContent;
    }

    public void setContent(Content content) {
        mContent = content;
    }

    public Double getExitLoad() {
        return mExitLoad;
    }

    public void setExitLoad(Double exitLoad) {
        mExitLoad = exitLoad;
    }

    public String getExitLoadText() {
        return mExitLoadText;
    }

    public void setExitLoadText(String exitLoadText) {
        mExitLoadText = exitLoadText;
    }

    public Object getFundAnalysis() {
        return mFundAnalysis;
    }

    public void setFundAnalysis(Object fundAnalysis) {
        mFundAnalysis = fundAnalysis;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Boolean getIsElss() {
        return mIsElss;
    }

    public void setIsElss(Boolean isElss) {
        mIsElss = isElss;
    }

    public Double getMinimumAdditionSubscription() {
        return mMinimumAdditionSubscription;
    }

    public void setMinimumAdditionSubscription(Double minimumAdditionSubscription) {
        mMinimumAdditionSubscription = minimumAdditionSubscription;
    }

    public Double getMinimumBalanceMaintainence() {
        return mMinimumBalanceMaintainence;
    }

    public void setMinimumBalanceMaintainence(Double minimumBalanceMaintainence) {
        mMinimumBalanceMaintainence = minimumBalanceMaintainence;
    }

    public Double getMinimumRedemption() {
        return mMinimumRedemption;
    }

    public void setMinimumRedemption(Double minimumRedemption) {
        mMinimumRedemption = minimumRedemption;
    }

    public Double getMinimumSipSubscription() {
        return mMinimumSipSubscription;
    }

    public void setMinimumSipSubscription(Double minimumSipSubscription) {
        mMinimumSipSubscription = minimumSipSubscription;
    }

    public Double getMinimumSubscription() {
        return mMinimumSubscription;
    }

    public void setMinimumSubscription(Double minimumSubscription) {
        mMinimumSubscription = minimumSubscription;
    }

    public Double getMinimumSwpWithdrawal() {
        return mMinimumSwpWithdrawal;
    }

    public void setMinimumSwpWithdrawal(Double minimumSwpWithdrawal) {
        mMinimumSwpWithdrawal = minimumSwpWithdrawal;
    }

    public Double getMultipleAdditionSubscription() {
        return mMultipleAdditionSubscription;
    }

    public void setMultipleAdditionSubscription(Double multipleAdditionSubscription) {
        mMultipleAdditionSubscription = multipleAdditionSubscription;
    }

    public Double getMultipleRedemption() {
        return mMultipleRedemption;
    }

    public void setMultipleRedemption(Double multipleRedemption) {
        mMultipleRedemption = multipleRedemption;
    }

    public Double getMultipleSubscription() {
        return mMultipleSubscription;
    }

    public void setMultipleSubscription(Double multipleSubscription) {
        mMultipleSubscription = multipleSubscription;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getObjective() {
        return mObjective;
    }

    public void setObjective(String objective) {
        mObjective = objective;
    }

    public Long getRating() {
        return mRating;
    }

    public void setRating(Long rating) {
        mRating = rating;
    }

    public Double getReturn3Yr() {
        return mReturn3Yr;
    }

    public void setReturn3Yr(Double return3Yr) {
        mReturn3Yr = return3Yr;
    }

    public Double getReturn5Yr() {
        return mReturn5Yr;
    }

    public void setReturn5Yr(Double return5Yr) {
        mReturn5Yr = return5Yr;
    }

    public String getRiskometer() {
        return mRiskometer;
    }

    public void setRiskometer(String riskometer) {
        mRiskometer = riskometer;
    }

    public String getSchemeClass() {
        return mSchemeClass;
    }

    public void setSchemeClass(String schemeClass) {
        mSchemeClass = schemeClass;
    }

    public String getSchemeDetailsId() {
        return mSchemeDetailsId;
    }

    public void setSchemeDetailsId(String schemeDetailsId) {
        mSchemeDetailsId = schemeDetailsId;
    }

    public String getSchemeType() {
        return mSchemeType;
    }

    public void setSchemeType(String schemeType) {
        mSchemeType = schemeType;
    }

    public Object getSid() {
        return mSid;
    }

    public void setSid(Object sid) {
        mSid = sid;
    }

    public String getSidUrl() {
        return mSidUrl;
    }

    public void setSidUrl(String sidUrl) {
        mSidUrl = sidUrl;
    }

    public String getSuitability() {
        return mSuitability;
    }

    public void setSuitability(String suitability) {
        mSuitability = suitability;
    }

    public String getUrlName() {
        return mUrlName;
    }

    public void setUrlName(String urlName) {
        mUrlName = urlName;
    }

    public Object getValueResearchRank() {
        return mValueResearchRank;
    }

    public void setValueResearchRank(Object valueResearchRank) {
        mValueResearchRank = valueResearchRank;
    }

    public Double getYoyReturn() {
        return mYoyReturn;
    }

    public void setYoyReturn(Double yoyReturn) {
        mYoyReturn = yoyReturn;
    }

}
