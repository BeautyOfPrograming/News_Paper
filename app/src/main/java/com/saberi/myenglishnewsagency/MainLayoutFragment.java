package com.saberi.myenglishnewsagency;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.saberi.myenglishnewsagency.retrofit.Api;
import com.saberi.myenglishnewsagency.retrofit.Services;
import com.saberi.myenglishnewsagency.retrofit.models.Article;
import com.saberi.myenglishnewsagency.retrofit.models.Root;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainLayoutFragment extends androidx.fragment.app.Fragment {


    List<Article> items = new ArrayList<>();
    NewItemAdapter adapter;

    RequestQueue requestQueue;

    Context context;
    int pos;

    public MainLayoutFragment() {

    }

    public MainLayoutFragment(int i) {

        this.pos = i;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//        View view = inflater.inflate(R.layout.fragmentlayout, container, false);
//        Log.d("statusnews", "inside");


        return inflater.inflate(R.layout.fragmentlayout, container, false);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        requestQueue = Volley.newRequestQueue(getActivity());
        final RecyclerView recyclerView = getView().findViewById(R.id.recyclerView);
        Log.d("statusnews", "inside");


        String urltemp = "";
        if (pos == 0) {
            urltemp = "/v2/top-headlines?sources=vice-news&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
        } else if (pos == 1)
//            urltemp = "/v2/top-headlines?sources=ary-news&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
            urltemp = "/v2/top-headlines?sources=vice-news&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
        else if (pos == 2)
                urltemp = "/v2/top-headlines?sources=abc-news&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
        else if (pos == 3)
            urltemp = "/v2/top-headlines?sources=bbc-sport&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
        else if (pos == 4)
            urltemp = "/v2/top-headlines?sources=usa-today&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
        else if (pos == 5)
            urltemp = "/v2/top-headlines?sources=cnn&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
        else if (pos == 6)
            urltemp = "/v2/top-headlines?sources=fox-news&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
        else if (pos == 7)
            urltemp = "/v2/top-headlines?sources=google-news&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
        else if (pos == 8)
            urltemp = "/v2/top-headlines?sources=the-verge&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
        else if (pos == 9)
            urltemp = "/v2/top-headlines?sources=news24&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
        else {
            urltemp = "/v2/top-headlines?sources=abc-news&apiKey=9e1ac8704e124f32ab6b70e9de3a56c8";
        }





        Api api = Services.getRetrofit().create(Api.class);


        Call<Root> call = api.getNewsFromInternet(urltemp);

        Log.e("workformhabib0",urltemp);

        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {

//                items = response.body();
//

                Log.e("workformhabib",response.code()+"");

//                Log.e("Works", response.body().getTotalResults() + "");

//                int size = Integer.parseInt(response.body().getTotalResults());

//                Log.e("size_of_object", size + "");

                for (int i = 0; i < 10; i++) {

                    Article article = response.body().getArticles().get(i);

                     if(article.getContent() == null)

                         article.setContent("I set");
                    Log.e("Main_L_F_array", article.getUrlToImage() + "");

                    items.add(article);

                }


//

                adapter = new NewItemAdapter(getActivity(), items);
                recyclerView.setAdapter(adapter);
//
                LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
                recyclerView.setLayoutManager(layoutManager);


//                Toast.makeText(getContext(),"worksss",Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                   t.getMessage();
                   t.printStackTrace();
            }
        });



    }


}
