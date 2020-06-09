package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.pojo
 * @Author: 库伦
 * @CreateTime: 2020-06-09 11:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable,Cloneable {
    /**
     * user_id;用户id
     */
    private Integer userId;
    /**
     * name;用户名
     */
    private String name;
    /**
     * pass;密码
     */
    private String pass;
    /**
     * image;头像
     */
    private String image;
    /**
     * phone;电话号码
     */
    private String phone;
    /**
     * sex;性别
     */
    private String sex;
    /**
     * role;角色
     */
    private Integer role;
    /**
     * money;金额
     */
    private Double money;
    /**
     * address;地址
     */
    private String address;
    /**
     * 乐观锁
     */
    private Integer revision;
    /**
     * 创建时间
     */
    private String createdTime;
    /**
     * 更新时间
     */
    private String updatedTime;
    /**
     * status;状态
     */
    private Integer status;

    public Users(Integer userId, String name, int role) {
        this.userId = userId;
        this.name = name;
        this.role = role;
    }
}
