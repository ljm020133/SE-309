package com.example.screens.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientFactory {
    static Retrofit apiClientSeed;

    static Retrofit GetApiClientSeed(){
        if (apiClientSeed == null){
        apiClientSeed = new Retrofit.Builder()
                .baseUrl("https://3fe17056-4125-4ca3-ba66-81c21ed306b8.mock.pstmn.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }
        return apiClientSeed;
    }

    public static UserApi GetUserAPi(){
        return GetApiClientSeed().create(UserApi.class);
    }
}
