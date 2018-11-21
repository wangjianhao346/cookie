package com.rain.cookie.entity;

import java.io.Serializable;

public class ResultBuilder {

    public static <T extends Serializable> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setDate(data);
        return result;
    }
}
