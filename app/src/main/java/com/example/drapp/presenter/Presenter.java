package com.example.drapp.presenter;

import com.example.drapp.model.Photo;
import com.example.drapp.model.Result;
import com.example.drapp.service.RetrofitInstance;
import com.example.drapp.view.IView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Presenter {

    private IView iView;
    private RetrofitInstance retrofitInstance;

    public Presenter(IView iView) {
        this.iView = iView;

        if (retrofitInstance == null) {
            retrofitInstance = new RetrofitInstance();
        }
    }

    public void getAllPhotos() {
        retrofitInstance.getRetrofitInstance().getMarsPhotoListCall().enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {

                Result result = response.body();
                System.out.println("result=====" + result);
                if (result != null) {
                    List<Photo> resultList = result.getPhotos();
                    System.out.println("result=====" + result.getPhotos());
                    iView.getPhotos(resultList);
                }

            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                try {
                    throw new InterruptedException("Something went wrong!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void getPhotoById() {

    }
}
