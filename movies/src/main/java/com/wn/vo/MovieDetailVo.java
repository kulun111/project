package com.wn.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailVo {

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
    private Date startDate ;
    /** total_time;总时长 */
    private Date totalTime ;

    private String type ;

    private String area;

    private String review;

    private Integer score;

    private Date createTime;






}
