
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Value implements Serializable {

    @SerializedName("allocation_percentage")
    private Double mAllocationPercentage;
    @SerializedName("instrument")
    private String mInstrument;
    @SerializedName("script")
    private String mScript;
    @SerializedName("sector")
    private String mSector;
    @SerializedName("value")
    private Double mValue;

    public Double getAllocationPercentage() {
        return mAllocationPercentage;
    }

    public void setAllocationPercentage(Double allocationPercentage) {
        mAllocationPercentage = allocationPercentage;
    }

    public String getInstrument() {
        return mInstrument;
    }

    public void setInstrument(String instrument) {
        mInstrument = instrument;
    }

    public String getScript() {
        return mScript;
    }

    public void setScript(String script) {
        mScript = script;
    }

    public String getSector() {
        return mSector;
    }

    public void setSector(String sector) {
        mSector = sector;
    }

    public Double getValue() {
        return mValue;
    }

    public void setValue(Double value) {
        mValue = value;
    }

}
