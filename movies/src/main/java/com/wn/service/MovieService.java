package com.wn.service;

import com.entity.MyRsp;
import com.pojo.Movies;
import com.wn.vo.MovieDetailVo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

public interface MovieService {
    //根据影片id，获取影片信息
    public MovieDetailVo getMovieInfo(Movies movie);
}
