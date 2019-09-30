
package com.example.piggyassignment.ApiModals;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Amc implements Serializable {

    @SerializedName("about")
    private String mAbout;
    @SerializedName("address")
    private String mAddress;
    @SerializedName("aum")
    private Double mAum;
    @SerializedName("display_name")
    private String mDisplayName;
    @SerializedName("display_name_id")
    private String mDisplayNameId;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("fund")
    private String mFund;
    @SerializedName("id")
    private Long mId;
    @SerializedName("launch_date")
    private String mLaunchDate;
    @SerializedName("name")
    private String mName;
    @SerializedName("phone")
    private String mPhone;
    @SerializedName("sponsor")
    private String mSponsor;

    public String getAbout() {
        return mAbout;
    }

    public void setAbout(String about) {
        mAbout = about;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public Double getAum() {
        return mAum;
    }

    public void setAum(Double aum) {
        mAum = aum;
    }

    public String getDisplayName() {
        return mDisplayName;
    }

    public void setDisplayName(String displayName) {
        mDisplayName = displayName;
    }

    public String getDisplayNameId() {
        return mDisplayNameId;
    }

    public void setDisplayNameId(String displayNameId) {
        mDisplayNameId = displayNameId;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getFund() {
        return mFund;
    }

    public void setFund(String fund) {
        mFund = fund;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getLaunchDate() {
        return mLaunchDate;
    }

    public void setLaunchDate(String launchDate) {
        mLaunchDate = launchDate;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getSponsor() {
        return mSponsor;
    }

    public void setSponsor(String sponsor) {
        mSponsor = sponsor;
    }

}
