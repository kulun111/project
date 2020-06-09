package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieType {

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
    private Date createdTime ;
    /** 更新时间 */
    private Date updatedTime ;
}
