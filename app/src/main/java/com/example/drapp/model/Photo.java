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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSol() {
        return sol;
    }

    public void setSol(Integer sol) {
        this.sol = sol;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getEarthDate() {
        return earthDate;
    }

    public void setEarthDate(String earthDate) {
        this.earthDate = earthDate;
    }

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }
}
