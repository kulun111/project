package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.pojo
 * @Author: 库伦
 * @CreateTime: 2020-06-09 11:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YtInfo implements Serializable,Cloneable {
    /**
     * yt_id
     */
    private Integer ytId;
    /**
     * yt_name
     */
    private String ytName;
    /**
     * describe;描述
     */
    private String describe;
    /**
     * yy_id;电影院id
     */
    private Integer yyId;
    /**
     * seat_count;座位数量
     */
    private Integer seatCount;
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
