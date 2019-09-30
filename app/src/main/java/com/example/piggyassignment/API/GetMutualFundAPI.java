package com.example.piggyassignment.API;

import com.example.piggyassignment.ApiModals.Root;
import com.example.piggyassignment.ApiModals2.PostRequestBody;
import com.example.piggyassignment.ApiModals2.Root2;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GetMutualFundAPI {

    @Headers({
            "content-type: application/json",
            "authorization: Token a41d2b39e3b47412504509bb5a1b66498fb1f43a",
            "cache-control: no-cache"
    })

    @GET("v1/mf/")
    Call<Root> getMutualFund(@Query("id") Long id);

}
