package com.example.piggyassignment.API;

import com.example.piggyassignment.ApiModals2.PostRequestBody;
import com.example.piggyassignment.ApiModals2.Root2;
import com.example.piggyassignment.ApiModals2.SearchResult;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface SearchAPI {

    @Headers({
            "authorization: Token a41d2b39e3b47412504509bb5a1b66498fb1f43a",
            "cache-control: no-cache",
            "content-type: application/json"
    })
    @POST("v2/mf/search/")
    Call<Root2> getSearchResult(@Body PostRequestBody postRequestBody);

}
