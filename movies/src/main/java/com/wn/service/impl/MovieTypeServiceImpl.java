package com.wn.service.impl;

import com.pojo.Movies;
import com.wn.mapper.MovieTypeMapper;
import com.wn.service.MovieTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieTypeServiceImpl implements MovieTypeService {

    @Autowired
    private MovieTypeMapper movieTypeMapper;

    @Override
    public String getMovieType(Movies movie) {

        String movieType = movieTypeMapper.getMovieType(movie);
        return movieType;
    }
}
