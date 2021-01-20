package com.saberi.myenglishnewsagency.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Services {

//      https://newsapi.org/v2/top-headlines?sources=associated-press&apiKey=7fc43c3ef4314a748fbcd1a9727ad492

     public final String baseUrl ="https://newsapi.org";
    private static Retrofit retrofit;
    private static Gson gson;

    public static Retrofit getRetrofit() {
        gson = new GsonBuilder()
                .create();

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://newsapi.org")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
