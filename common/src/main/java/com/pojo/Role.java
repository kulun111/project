package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.pojo
 * @Author: 库伦
 * @CreateTime: 2020-06-09 11:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable,Cloneable {
    /**
     * role_id
     */
    private Integer roleId;
    /**
     * role_name
     */
    private String roleName;
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
     * 状态;状态
     */
    private Integer status;
}
