package com.example.merks.httpclient;

import com.example.merks.Model.Responsemerk;

import retrofit2.Call;
import retrofit2.http.GET;
public interface ApiInterface {
    @GET("androidstd.json?auth=4d6xwraaPuSRRdMmHNxCBLsiMQ7536srH2E3z9Mu")
    Call<Responsemerk> getData();


}