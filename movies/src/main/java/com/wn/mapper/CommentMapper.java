package com.wn.mapper;

import com.pojo.Comment;
import com.pojo.Movies;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Mapper
@Repository
public interface CommentMapper {

    public Comment getComment( Movies movie);
}
