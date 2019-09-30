
package com.example.piggyassignment.ApiModals2;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Riskometer implements Serializable {

    @SerializedName("doc_count")
    private Long mDocCount;
    @SerializedName("key")
    private String mKey;

    public Long getDocCount() {
        return mDocCount;
    }

    public void setDocCount(Long docCount) {
        mDocCount = docCount;
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        mKey = key;
    }

}
