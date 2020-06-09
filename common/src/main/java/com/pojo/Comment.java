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
public class Comment implements Serializable,Cloneable{
    /** com_id */
    private Integer comId ;
    /** user_id */
    private Integer userId ;
    /** movie_id */
    private Integer movieId ;
    /** review;评论类容 */
    private String review ;
    /** score;分数 */
    private Integer score ;
    /** status */
    private Integer status ;
    /** 乐观锁 */
    private Integer revision ;
    /** 创建时间 */
    private String createdTime ;
    /** 更新时间 */
    private String updatedTime ;
}
