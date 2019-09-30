
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class TraditionalSipDetails implements Serializable {

    @SerializedName("maximum_sip_amount")
    private Long mMaximumSipAmount;
    @SerializedName("minimum_sip_amount")
    private Long mMinimumSipAmount;
    @SerializedName("sip_dates")
    private List<Long> mSipDates;
    @SerializedName("sip_max_installments")
    private Long mSipMaxInstallments;
    @SerializedName("sip_min_installments")
    private Long mSipMinInstallments;
    @SerializedName("traditional_sip_enabled")
    private Long mTraditionalSipEnabled;

    public Long getMaximumSipAmount() {
        return mMaximumSipAmount;
    }

    public void setMaximumSipAmount(Long maximumSipAmount) {
        mMaximumSipAmount = maximumSipAmount;
    }

    public Long getMinimumSipAmount() {
        return mMinimumSipAmount;
    }

    public void setMinimumSipAmount(Long minimumSipAmount) {
        mMinimumSipAmount = minimumSipAmount;
    }

    public List<Long> getSipDates() {
        return mSipDates;
    }

    public void setSipDates(List<Long> sipDates) {
        mSipDates = sipDates;
    }

    public Long getSipMaxInstallments() {
        return mSipMaxInstallments;
    }

    public void setSipMaxInstallments(Long sipMaxInstallments) {
        mSipMaxInstallments = sipMaxInstallments;
    }

    public Long getSipMinInstallments() {
        return mSipMinInstallments;
    }

    public void setSipMinInstallments(Long sipMinInstallments) {
        mSipMinInstallments = sipMinInstallments;
    }

    public Long getTraditionalSipEnabled() {
        return mTraditionalSipEnabled;
    }

    public void setTraditionalSipEnabled(Long traditionalSipEnabled) {
        mTraditionalSipEnabled = traditionalSipEnabled;
    }

}
