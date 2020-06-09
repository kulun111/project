package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.pojo
 * @Author: 库伦
 * @CreateTime: 2020-06-09 11:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieType implements Serializable,Cloneable{
    /** type_id */
    private Integer typeId ;
    /** type_name */
    private String typeName ;
    /** country;出品国家 */
    private String country ;
    /** status */
    private Integer status ;
    /** 乐观锁 */
    private Integer revision ;
    /** 创建时间 */
    private String createdTime ;
    /** 更新时间 */
    private String updatedTime ;
}
