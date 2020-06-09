package com.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movies {
    private Integer movieid ;
    /** moviename */
    private String moviename ;
    /** movie_image */
    private String movieImage ;
    /** direct;导演 */
    private String direct ;
    /** describe;描述 */
    private String describe ;
    /** start_date;上映日期 */
    private String startDate ;
    /** total_time;总时长 */
    private String totalTime ;
    /** type_id;类型id */
    private String type ;

    private String area;

    private Integer status;
    /** 乐观锁 */
    private Integer revision ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新时间 */
    private Date updatedTime ;

}
