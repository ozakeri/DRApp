package com.example.drapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("sol")
    @Expose
    public Integer sol;
    @SerializedName("camera")
    @Expose
    public Camera camera;
    @SerializedName("img_src")
    @Expose
    public String imgSrc;
    @SerializedName("earth_date")
    @Expose
    public String earthDate;
    @SerializedName("rover")
    @Expose
    public Rover rover;
}
