
package com.example.piggyassignment.ApiModals2;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Root2 implements Serializable {

    @SerializedName("data")
    private Data mData;
    @SerializedName("status-code")
    private Long mStatusCode;
    @SerializedName("status-message")
    private String mStatusMessage;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public Long getStatusCode() {
        return mStatusCode;
    }

    public void setStatusCode(Long statusCode) {
        mStatusCode = statusCode;
    }

    public String getStatusMessage() {
        return mStatusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        mStatusMessage = statusMessage;
    }

}
