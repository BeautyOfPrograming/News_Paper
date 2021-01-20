package com.saberi.myenglishnewsagency.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Article {

    @SerializedName("source")
    @Expose
    private Source source;

    public Source getSource() {
        return this.source;
    }



    public void setSource(Source source) {
        this.source = source;
    }



    @SerializedName("author")
    @Expose  private String author;
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @SerializedName("title")
    @Expose  private String title;
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




    @SerializedName("description")
    @Expose  private String description;
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    @SerializedName("url")
    @Expose  private String url;
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    @SerializedName("urlToImage")
    @Expose  private String urlToImage;
    public String getUrlToImage() {
        return this.urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }



    @SerializedName("publishedAt")
     @Expose  private String publishedAt;
    public String getPublishedAt() {
        return this.publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

//    Date publishedAt;

    @SerializedName("content")

    @Expose  private String content;
    public Object getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}