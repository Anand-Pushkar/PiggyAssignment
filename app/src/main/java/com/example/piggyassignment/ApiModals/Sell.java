
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Sell implements Serializable {

    @SerializedName("can_sell")
    private Long mCanSell;
    @SerializedName("sell_block_message")
    private String mSellBlockMessage;

    public Long getCanSell() {
        return mCanSell;
    }

    public void setCanSell(Long canSell) {
        mCanSell = canSell;
    }

    public String getSellBlockMessage() {
        return mSellBlockMessage;
    }

    public void setSellBlockMessage(String sellBlockMessage) {
        mSellBlockMessage = sellBlockMessage;
    }

}
