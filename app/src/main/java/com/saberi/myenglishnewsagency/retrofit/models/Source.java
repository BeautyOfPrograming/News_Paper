package com.saberi.myenglishnewsagency.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source{

    @SerializedName("id")
    @Expose
    private String id;
    public String getId() {
        return this.id; }
    public void setId(String id) {
        this.id = id; }



    @SerializedName("name")
    @Expose
    private String name;
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }

}
