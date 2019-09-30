
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Header implements Serializable {

    @SerializedName("allocation_percentage")
    private String mAllocationPercentage;
    @SerializedName("instrument")
    private String mInstrument;
    @SerializedName("script")
    private String mScript;
    @SerializedName("sector")
    private String mSector;
    @SerializedName("value")
    private String mValue;

    public String getAllocationPercentage() {
        return mAllocationPercentage;
    }

    public void setAllocationPercentage(String allocationPercentage) {
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

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

}
