package com.coolweather.android.db;

import com.coolweather.android.gson.AQI;
import com.coolweather.android.gson.Basic;
import com.coolweather.android.gson.Forecast;
import com.coolweather.android.gson.Now;
import com.coolweather.android.gson.Suggestion;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 一个傻傻的小男孩 on 2018/5/2.
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
