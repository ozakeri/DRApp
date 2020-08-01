package com.example.drapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rover {
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("landing_date")
    @Expose
    public String landingDate;
    @SerializedName("launch_date")
    @Expose
    public String launchDate;
    @SerializedName("status")
    @Expose
    public String status;
}
