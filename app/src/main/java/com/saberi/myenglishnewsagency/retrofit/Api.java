package com.saberi.myenglishnewsagency.retrofit;

import com.saberi.myenglishnewsagency.retrofit.models.Root;

import retrofit2.Call;

import retrofit2.http.GET;
import retrofit2.http.Url;

public interface Api {

    // API's endpoints   ("/v2/top-headlines?country=us&apiKey=7fc43c3ef4314a748fbcd1a9727ad492")

    @GET
    Call<Root> getNewsFromInternet(@Url String url);

//    http://newsapi.org/v2/top-headlines?country=us&apiKey=7fc43c3ef4314a748fbcd1a9727ad492

//    /v2/top-headlines?sources=associated-press&apiKey=7fc43c3ef4314a748fbcd1a9727ad492

// UserListResponse is POJO class to get the data from API, In above method
// we use List<UserListResponse> because the data in our API is starting from JSONArray and callback is used to get the response from api and it will set it in our POJO class

}
