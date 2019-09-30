
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class Data implements Serializable {

    @SerializedName("block_message")
    private String mBlockMessage;
    @SerializedName("can_invest")
    private Long mCanInvest;
    @SerializedName("funds")
    private List<Fund> mFunds;
    @SerializedName("holdings")
    private Holdings mHoldings;
    @SerializedName("is_tax_saving_fund")
    private Boolean mIsTaxSavingFund;
    @SerializedName("mutual_fund")
    private MutualFund mMutualFund;
    @SerializedName("user")
    private User mUser;

    public String getBlockMessage() {
        return mBlockMessage;
    }

    public void setBlockMessage(String blockMessage) {
        mBlockMessage = blockMessage;
    }

    public Long getCanInvest() {
        return mCanInvest;
    }

    public void setCanInvest(Long canInvest) {
        mCanInvest = canInvest;
    }

    public List<Fund> getFunds() {
        return mFunds;
    }

    public void setFunds(List<Fund> funds) {
        mFunds = funds;
    }

    public Holdings getHoldings() {
        return mHoldings;
    }

    public void setHoldings(Holdings holdings) {
        mHoldings = holdings;
    }

    public Boolean getIsTaxSavingFund() {
        return mIsTaxSavingFund;
    }

    public void setIsTaxSavingFund(Boolean isTaxSavingFund) {
        mIsTaxSavingFund = isTaxSavingFund;
    }

    public MutualFund getMutualFund() {
        return mMutualFund;
    }

    public void setMutualFund(MutualFund mutualFund) {
        mMutualFund = mutualFund;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

}
