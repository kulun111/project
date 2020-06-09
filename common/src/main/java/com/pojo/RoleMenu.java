package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.pojo
 * @Author: 库伦
 * @CreateTime: 2020-06-09 11:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleMenu implements Serializable,Cloneable {
    /**
     * id
     */
    private Integer id;
    /**
     * menu_id
     */
    private Integer menuId;
    /**
     * role_id
     */
    private Integer roleId;
    /**
     * status
     */
    private Integer status;
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
}
