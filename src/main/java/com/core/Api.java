package com.core;

import com.alibaba.fastjson.JSONObject;

public class Api {
    public static String AllNet = "http://127.0.0.1:5000/";
    public static String login = AllNet+"/login/";
    public static String register = AllNet+"/register/";
    public static String getList = AllNet+"/GetList/";
    public static String getLine = AllNet+"/GetLine/";
    public static String getGroup = AllNet+"/GetGroup/";
    public static String getField = AllNet+"/GetField/";
    public static String getFieldYX = AllNet+"/GetFieldYX/";
    public static String globalSearch = AllNet+"/GlobalSearch/";

    public static JSONObject linkError(){
        JSONObject error = new JSONObject();
        error.put("status", false);
        error.put("message", "网络连接错误");
        return error;
    }
}
