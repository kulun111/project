package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.pojo
 * @Author: 库伦
 * @CreateTime: 2020-06-09 11:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Upmovie implements Serializable,Cloneable {
    /**
     * upmovie_id
     */
    private Integer upmovieId;
    /**
     * yt_id;影厅id
     */
    private Integer ytId;
    /**
     * movie_id;电影id
     */
    private Integer movieId;
    /**
     * start_time;开始时间
     */
    private String startTime;
    /**
     * over_time;结束时间
     */
    private String overTime;
    /**
     * price
     */
    private Double price;
    /**
     * status
     */
    private Integer status;
    /**
     * 更新时间
     */
    private String updatedTime;
    /**
     * 乐观锁
     */
    private Integer revision;
    /**
     * 创建时间
     */
    private String createdTime;
}
