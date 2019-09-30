
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class Top5Instruments implements Serializable {

    @SerializedName("header")
    private Header mHeader;
    @SerializedName("values")
    private List<Value> mValues;

    public Header getHeader() {
        return mHeader;
    }

    public void setHeader(Header header) {
        mHeader = header;
    }

    public List<Value> getValues() {
        return mValues;
    }

    public void setValues(List<Value> values) {
        mValues = values;
    }

}
