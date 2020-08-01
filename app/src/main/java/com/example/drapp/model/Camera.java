package com.example.drapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Camera {
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("rover_id")
    @Expose
    public Integer roverId;
    @SerializedName("full_name")
    @Expose
    public String fullName;
}
