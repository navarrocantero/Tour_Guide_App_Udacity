package com.android.driftineo.tourguideapp.model;

/**
 * Created by driftineo on 20/5/17.
 */

public class Time {
    private String time;
    private int model;
    private int imageResource;

    public Time(int model, String time) {
        this.model = model;
        this.time = time;
        this.imageResource = -1;

    }

    public Time(int model, String time, int imageResource) {

        this.model = model;
        this.time = time;

        this.imageResource = imageResource;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setModel(int model) {
        this.model = model;
    }


    public String getTime() {
        return time;
    }

    public int getModel() {
        return model;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }


}
