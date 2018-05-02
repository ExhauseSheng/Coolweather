package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 一个傻傻的小男孩 on 2018/5/2.
 */

public class Country extends DataSupport {

    private int id;
    private String countryName;     //县的名字
    private String weatherId;       //县对应天气的Id
    private int cityId;             //当前县对应的市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
