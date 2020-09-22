package com.core;

import com.alibaba.fastjson.JSONObject;
import okhttp3.OkHttpClient;


import java.io.IOException;

public class Account {
    private Boolean accountStatus = false;
    private String UserName;
    private String Password;
    private JSONObject SafetyCode;
    private int identity;

    public Account(){
        identity = 1;
        UserName = "";
        Password = "";
        SafetyCode = null;
    }


    public JSONObject Login(String UserName, String Password){
        JSONObject form = new JSONObject();
        String MD5_PW = MD5.encryption(Password);
        this.UserName = UserName;
        this.Password = MD5_PW;
        form.put("UserName",UserName);
        form.put("password",MD5_PW);
        JSONObject reslult = null;
        try {
            reslult = Net.POST(Api.login,form);
        } catch (Exception e) {
            JSONObject error = new JSONObject();
            error.put("status", false);
            error.put("message", "网络连接错误");
            return error;
        }
        if (reslult.getBoolean("status")){
            this.accountStatus = true;
            identity = reslult.getIntValue("identity");
        }
        this.SafetyCode = reslult.getJSONObject("SafetyCode");
        return reslult;
    }

    public JSONObject Register(String UserName, String Password) {
        JSONObject form = new JSONObject();
        String MD5_PW = MD5.encryption(Password);
        this.UserName = UserName;
        this.Password = MD5_PW;
        form.put("UserName",UserName);
        form.put("password",MD5_PW);
        JSONObject reslult = null;
        try {
            reslult = Net.POST(Api.register,form);
        } catch (Exception e) {
            JSONObject error = new JSONObject();
            error.put("status", false);
            error.put("message", "网络连接错误");
            return error;
        }
        this.SafetyCode = reslult.getJSONObject("SafetyCode");
        return reslult;
    }

    public void SignOut(){
        UserName = "";
        Password = "";
        SafetyCode = new JSONObject();
        this.accountStatus = false;
    }

    public int getIdentity() {
        return identity;
    }

    public Boolean getAccountStatus() {
        return accountStatus;
    }

    public JSONObject getSafetyCode() {
        return SafetyCode;
    }
}
