package com.example.covidtracker;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apiservice {

    @GET("/summary")
    Call<Summary> getCovid();

}
