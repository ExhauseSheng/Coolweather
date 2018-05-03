package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 一个傻傻的小男孩 on 2018/5/2.
 */

public class Basic {

    @SerializedName("city")
    //因为JSON中的一些字段可能不太适合直接作为Java字段来命名，所以用注解的方式来让JSON字段和Java字段之间建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
