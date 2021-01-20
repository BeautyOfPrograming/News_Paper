package com.saberi.myenglishnewsagency.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Root {

    @SerializedName("status")
    @Expose
    private String status;

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @SerializedName("totalResults")
    @Expose
    private String totalResults;

    public String getTotalResults() {
        return this.totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }




    @SerializedName("articles")
    @Expose
    private List<Article> articles;
    public List<Article> getArticles() {
        return this.articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }




}