package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.pojo
 * @Author: 库伦
 * @CreateTime: 2020-06-09 11:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail implements Serializable,Cloneable {
    /**
     * detail_id
     */
    private Integer detailId;
    /**
     * upmovie_id;影片id
     */
    private Integer upmovieId;
    /**
     * seat_num
     */
    private Integer seatNum;
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
