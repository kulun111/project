package com.wn.mapper;

import com.entity.MyRsp;
import com.pojo.Movies;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;


@Mapper
@Repository
public interface MovieTypeMapper {

    public String getMovieType( Movies movie);
}
