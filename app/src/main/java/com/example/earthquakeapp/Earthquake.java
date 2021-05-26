package com.example.earthquakeapp;

public class Earthquake {

    private String mmagnitude;
    private String mcity;
    private String mdate;

    public Earthquake(String magnitude, String city, String date){
        mmagnitude = magnitude;
        mcity = city;
        mdate = date;
    }

    public String getMagnitude(){
        return mmagnitude;
    }

    public String getcity(){
        return mcity;
    }

    public String getMdate(){
        return mdate;
    }
}

