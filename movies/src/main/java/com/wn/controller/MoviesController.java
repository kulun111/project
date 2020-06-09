package com.wn.controller;

import com.entity.MyParam;
import com.entity.MyRsp;
import com.pojo.Movies;
import com.wn.service.MovieService;
import com.wn.service.MovieTypeService;
import com.wn.vo.MovieDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieTypeService movieTypeService;

    /**
     * 根据影片id 获取影片信息
     * @param m 只有影片id
     * @return
     */
    @RequestMapping("/getMovieInfo")
    public MyRsp getMovieInfo(@RequestBody MyParam<Movies> m){
        //测试用
        System.out.println(m);

        Movies movie = m.getT();

        //调用业务层方法
        MovieDetailVo movieInfo = movieService.getMovieInfo(movie);
        return new MyRsp().successData(movieInfo);
    }


    @RequestMapping("/getMovieType")
    public MyRsp getMovieType(@RequestBody MyParam<Movies> m){
        Movies movie = m.getT();
        String movieType = movieTypeService.getMovieType(movie);
        return new MyRsp().successData(movieType);

    }
}
