package com.wn.service;

import com.entity.MyRsp;
import com.pojo.Movies;
import org.springframework.web.bind.annotation.RequestBody;

public interface MovieTypeService {

    //根据影片id获取影片的类型
    public String getMovieType( Movies movie);
}
