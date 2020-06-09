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
    private Date startDate ;
    /** total_time;总时长 */
    private Date totalTime ;
    /** type_id;类型id */
    private String type ;

    private String area;
    /** 乐观锁 */
    private Integer revision ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新时间 */
    private Date updatedTime ;

    public Integer status;

    /** movieid */
    public Integer getMovieid(){
        return this.movieid;
    }
    /** movieid */
    public void setMovieid(Integer movieid){
        this.movieid = movieid;
    }
    /** moviename */
    public String getMoviename(){
        return this.moviename;
    }
    /** moviename */
    public void setMoviename(String moviename){
        this.moviename = moviename;
    }
    /** movie_image */
    public String getMovieImage(){
        return this.movieImage;
    }
    /** movie_image */
    public void setMovieImage(String movieImage){
        this.movieImage = movieImage;
    }
    /** direct;导演 */
    public String getDirect(){
        return this.direct;
    }
    /** direct;导演 */
    public void setDirect(String direct){
        this.direct = direct;
    }
    /** describe;描述 */
    public String getDescribe(){
        return this.describe;
    }
    /** describe;描述 */
    public void setDescribe(String describe){
        this.describe = describe;
    }
    /** start_date;上映日期 */
    public Date getStartDate(){
        return this.startDate;
    }
    /** start_date;上映日期 */
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }
    /** total_time;总时长 */
    public Date getTotalTime(){
        return this.totalTime;
    }
    /** total_time;总时长 */
    public void setTotalTime(Date totalTime){
        this.totalTime = totalTime;
    }
    /** type_id;类型id */
    public String getTypeId(){
        return this.type;
    }
    /** type_id;类型id */
    public void setTypeId(Integer typeId){
        this.type = type;
    }
    /** 乐观锁 */
    public Integer getRevision(){
        return this.revision;
    }
    /** 乐观锁 */
    public void setRevision(Integer revision){
        this.revision = revision;
    }
    /** 创建时间 */
    public Date getCreatedTime(){
        return this.createdTime;
    }
    /** 创建时间 */
    public void setCreatedTime(Date createdTime){
        this.createdTime = createdTime;
    }
    /** 更新时间 */
    public Date getUpdatedTime(){
        return this.updatedTime;
    }
    /** 更新时间 */
    public void setUpdatedTime(Date updatedTime){
        this.updatedTime = updatedTime;
    }



}
