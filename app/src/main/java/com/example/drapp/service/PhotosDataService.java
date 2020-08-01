package com.example.drapp.service;

import com.example.drapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PhotosDataService {
    @GET("mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY")
    Call<Result> getMarsPhotoListCall();
}
