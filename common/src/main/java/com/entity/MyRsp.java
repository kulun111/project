package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.entity
 * @Author: 库伦
 * @CreateTime: 2020-06-09 10:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyRsp {
    private Integer code;
    private String msg;
    private Object data;

    //带数据的请求成功
    public MyRsp successData(Object data){
        return new MyRsp(Key.Code.SUCCESS,"请求成功",data);
    }
    //带信息的请求成功
    public MyRsp successMsg(String msg){
        return new MyRsp(Key.Code.SUCCESS,msg,null);
    }
    //带数据和信息的请求成功
    public MyRsp success(String msg,Object data){
        return new MyRsp(Key.Code.SUCCESS,msg,data);
    }

    //无参失败方法
    public MyRsp fail(){
        return new MyRsp(Key.Code.FAIL,"请求失败",null);
    }
    //带信息的失败方法
    public MyRsp failMsg(String msg){
        return new MyRsp(Key.Code.FAIL,msg,null);
    }
    //带信息和数据的失败方法
    public MyRsp failData(Object data){
        return new MyRsp(Key.Code.FAIL,"请求失败",data);
    }

}
