package com.wn.mapper;

import com.entity.MyRsp;
import com.pojo.Movies;
import com.wn.vo.MovieDetailVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MovieMapper {

    //根据影片id，获取影片信息
    public MovieDetailVo getMovieInfo(Movies movie);
}
