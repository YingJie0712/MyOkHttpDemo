package com.chenyingjie.okhttp.http;

/**
 * create by chenyingjie on 2020/6/8
 * desc
 */
public interface OkCallback {

    void onError(int code, String message);
    void onResult(String response);
}
