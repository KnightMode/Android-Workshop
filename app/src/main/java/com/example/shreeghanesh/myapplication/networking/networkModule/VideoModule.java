package com.example.shreeghanesh.myapplication.networking.networkModule;

import com.example.shreeghanesh.myapplication.networking.retrofit.RetrofitClientInstance;

public class VideoModule {

    public static VideoApiService getVideoApiService() {
        return RetrofitClientInstance.getRetrofitInstance().create(VideoApiService.class);
    }
}
