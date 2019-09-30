
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class User implements Serializable {

    @SerializedName("has_piggy_credit_transaction")
    private Long mHasPiggyCreditTransaction;
    @SerializedName("sell")
    private Sell mSell;

    public Long getHasPiggyCreditTransaction() {
        return mHasPiggyCreditTransaction;
    }

    public void setHasPiggyCreditTransaction(Long hasPiggyCreditTransaction) {
        mHasPiggyCreditTransaction = hasPiggyCreditTransaction;
    }

    public Sell getSell() {
        return mSell;
    }

    public void setSell(Sell sell) {
        mSell = sell;
    }

}
