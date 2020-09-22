package com.core;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Message {
    private Account acc;
    private JSONObject safetyCode;
    public Message(Account acc){
        this.acc = acc;
        safetyCode = acc.getSafetyCode();
    }


    public JSONObject getGroup(){
        try {
            JSONObject form = new JSONObject();
            form.put("SafetyCode",safetyCode);
            JSONObject res = Net.POST(Api.getGroup,form);
            return res;
        } catch (Exception e) {
            return Api.linkError();
        }
    }

    public JSONObject getField(String GroupName,Boolean or_YX){
        try {
            JSONObject form = new JSONObject();
            form.put("SafetyCode",safetyCode);
            form.put("GroupName", GroupName);
            JSONObject res;
            if (or_YX){
                res = Net.POST(Api.getFieldYX, form);
            }else {
                res = Net.POST(Api.getField, form);
            }
            return res;
        } catch (Exception e) {
            return Api.linkError();
        }
    }

    public JSONObject getList(String Group, String field,String key,String value){
        try {
            JSONObject form = new JSONObject();
            form.put("SafetyCode",safetyCode);
            form.put("GroupName", Group);
            form.put("FieldName", field);
            form.put("key",key);
            form.put("value",value);
            JSONObject res = Net.POST(Api.getList,form);
            return res;
        } catch (Exception e) {
            return Api.linkError();
        }
    }

    public JSONObject getLine(String Group, String key,String value){
        try {
            JSONObject form = new JSONObject();
            form.put("SafetyCode",safetyCode);
            form.put("GroupName", Group);
            form.put("key",key);
            form.put("value",value);
            JSONObject res = Net.POST(Api.getLine,form);
            return res;
        } catch (Exception e) {
            return Api.linkError();
        }
    }

    public JSONObject globalSearch(String value){
        try {
            JSONObject form = new JSONObject();
            form.put("SafetyCode",safetyCode);
            form.put("value",value);
            JSONObject res = Net.POST(Api.globalSearch,form);
            return res;
        } catch (Exception e) {
            return Api.linkError();
        }
    }


}
