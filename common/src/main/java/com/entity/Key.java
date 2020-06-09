package com.entity;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.entity
 * @Author: 库伦
 * @CreateTime: 2020-06-09 10:46
 */
public interface Key {
    //状态码定义
    interface Code{
        Integer SUCCESS=20000;
        Integer FAIL=50000;
    }

    interface RsaPath{
        String PRIVATE = "D:\\rsa\\rsa.pri";
        String PUBLIC = "D:\\rsa\\rsa.pub";
    }

}
