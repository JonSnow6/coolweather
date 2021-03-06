package com.coolweather.yc.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LZC on 2018/2/1.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public  String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
