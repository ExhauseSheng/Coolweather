package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 一个傻傻的小男孩 on 2018/5/2.
 */

public class City extends DataSupport {

    private int id;
    private String cityName;    //市的名字
    private int cityCode;       //市的代号
    private int provinceId;     //当前市所对应的省的ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
