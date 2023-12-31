package com.example.facerecognition.util;

import lombok.Data;

import java.io.Serializable;

/**
 * @author pc
 * 2022-04-06 10:47:19
 */
@Data
public class R<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    public static <T> R<T> ok(T data) {
        R<T> r = new R<>();
        r.setCode(200);
        r.setMsg("success");
        r.setData(data);
        return r;
    }

}
