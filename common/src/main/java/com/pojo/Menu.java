package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.pojo
 * @Author: 库伦
 * @CreateTime: 2020-06-09 11:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu implements Serializable,Cloneable {
    /**
     * menu_id
     */
    private Integer menuId;
    /**
     * parent_id
     */
    private Integer parentId;
    /**
     * name
     */
    private String name;
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
