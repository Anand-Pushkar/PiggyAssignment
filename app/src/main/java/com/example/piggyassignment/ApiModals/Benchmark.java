
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Benchmark implements Serializable {

    @SerializedName("name")
    private String mName;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}
