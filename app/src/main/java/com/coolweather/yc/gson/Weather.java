package com.coolweather.yc.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by LZC on 2018/2/2.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}