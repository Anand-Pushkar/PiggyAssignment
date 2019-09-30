
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Holdings implements Serializable {

    @SerializedName("top_10_holdings")
    private Top10Holdings mTop10Holdings;
    @SerializedName("top_5_instruments")
    private Top5Instruments mTop5Instruments;
    @SerializedName("top_5_sectors")
    private Top5Sectors mTop5Sectors;

    public Top10Holdings getTop10Holdings() {
        return mTop10Holdings;
    }

    public void setTop10Holdings(Top10Holdings top10Holdings) {
        mTop10Holdings = top10Holdings;
    }

    public Top5Instruments getTop5Instruments() {
        return mTop5Instruments;
    }

    public void setTop5Instruments(Top5Instruments top5Instruments) {
        mTop5Instruments = top5Instruments;
    }

    public Top5Sectors getTop5Sectors() {
        return mTop5Sectors;
    }

    public void setTop5Sectors(Top5Sectors top5Sectors) {
        mTop5Sectors = top5Sectors;
    }

}
