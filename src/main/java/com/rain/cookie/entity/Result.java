package com.rain.cookie.entity;

import java.io.Serializable;

public class Result<T extends Serializable> implements Serializable {
    private String code;

    private String message;

    private T date;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}