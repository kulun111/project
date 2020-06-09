package com.pojo;

import java.io.Serializable;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.pojo
 * @Author: 库伦
 * @CreateTime: 2020-06-09 11:34
 */
public class YyInfo implements Serializable,Cloneable {
    /**
     * yy_id
     */
    private Integer yyId;
    /**
     * yy_name
     */
    private String yyName;
    /**
     * address
     */
    private String address;
    /**
     * area;区域、市
     */
    private String area;
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
