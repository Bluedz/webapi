package com.xtk.apistation.webapi.bean;

import java.io.Serializable;

/**
 * @author
 * @date
 *
 */
public class ResponseResult implements Serializable { //

    private static final long serialVersionUID = -999362211833007653L;

    /**
     * 是否成功，成功找data、失败找msg
     */
    public boolean success;


    /**
     * 返回消息，一般放置可追溯的错误消息
     */
    public String msg;

    /**
     * 返回数据
     */
    public Object data;


    private ResponseResult(boolean success,  String msg , Object data) { //
        this.success = success;
        this.msg = msg;
        this.data = data;

    }

    public static ResponseResult success(Object data){
        return new ResponseResult(true,"请求成功完成",data);
    }

    public static ResponseResult fail(String msg){
        return new ResponseResult(false, msg,null);
    }


}

