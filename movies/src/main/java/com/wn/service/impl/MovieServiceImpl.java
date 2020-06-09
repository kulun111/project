package com.wn.service.impl;

import com.entity.MyRsp;
import com.netflix.discovery.converters.Auto;
import com.pojo.Comment;
import com.pojo.Movies;
import com.wn.mapper.CommentMapper;
import com.wn.mapper.MovieMapper;
import com.wn.mapper.MovieTypeMapper;
import com.wn.service.MovieService;
import com.wn.vo.MovieDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;

@Service
public class MovieServiceImpl  implements MovieService {

    @Autowired
    private MovieMapper movieMapper;

    @Autowired
    private MovieTypeMapper movieTypeMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public MovieDetailVo getMovieInfo(Movies movie) {
        //根据影片id获取影片信息
        MovieDetailVo movieDetail = movieMapper.getMovieInfo(movie);

        //根据影片id获取影片类型
       /* String movieType = movieTypeMapper.getMovieType(movie);*/

        //根据影片id获取影片评论
        Comment comment = commentMapper.getComment(movie);

        //获取评论内容
        String review = comment.getReview();

        //获取评论星级
        Integer score = comment.getScore();

        //加入评论信息
        movieDetail.setReview(review);
        movieDetail.setScore(score);

        //根据用户id获取用户信息

        //创建movieDetailVo对象返回详情页所需数据
      

        return movieDetail;
    }
}
