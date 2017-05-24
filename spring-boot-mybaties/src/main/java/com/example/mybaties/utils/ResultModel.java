package com.example.mybaties.utils;

import org.omg.CORBA.INTERNAL;

/**
 * Created by Andrew on 2017/5/24.
 */
public class ResultModel {
    private int code;
    private Object data;
    private String msg;


    public ResultModel(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
