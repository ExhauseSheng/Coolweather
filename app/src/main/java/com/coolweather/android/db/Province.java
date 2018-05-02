package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 一个傻傻的小男孩 on 2018/5/2.
 */

/**
 * 省的实体类
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;    //记录省的名字
    private int provinceCode;       //记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
