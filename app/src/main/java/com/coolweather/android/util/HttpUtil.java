package com.coolweather.android.util;

/**
 * Created by 一个傻傻的小男孩 on 2018/5/2.
 */

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 在这里和服务器进行交互
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        //如果我们要发起一条http请求只要调用sendOkHttpRequest方法就行了，传入请求地址，并注册一个回调来处理响应
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
