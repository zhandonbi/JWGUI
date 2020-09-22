package com.core;

import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import java.util.Objects;

public class Net {
    private static OkHttpClient cilent = new OkHttpClient();
    public static JSONObject GET(String url) throws Exception {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = Net.cilent.newCall(request).execute();
        if (response.isSuccessful()) {
            return (JSONObject) JSONObject.parse(Objects.requireNonNull(response.body()).string());
        }else{
            throw new Exception("连接异常");
        }
    }
    public static JSONObject POST(String url, JSONObject form) throws Exception {
        FormBody.Builder Form = new FormBody.Builder();
        for (String key:form.keySet()){
            Form.add(key,form.getString(key));
        }
        Request request = new Request.Builder()
                .url(url)
                .post(Form.build())
                .build();
        Response response = Net.cilent.newCall(request).execute();
        if (response.isSuccessful()) {
            return (JSONObject) JSONObject.parse(Objects.requireNonNull(response.body()).string());
        }else{
            throw new Exception("连接异常");
        }
    }
}
