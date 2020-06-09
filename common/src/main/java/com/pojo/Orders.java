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
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements Serializable,Cloneable {
    /**
     * order_id
     */
    private Integer orderId;
    /**
     * user_id
     */
    private Integer userId;
    /**
     * total_price
     */
    private Double totalPrice;
    /**
     * status
     */
    private Integer status;
    /**
     * 创建时间
     */
    private String createdTime;
    /**
     * 更新时间
     */
    private String updatedTime;
}
