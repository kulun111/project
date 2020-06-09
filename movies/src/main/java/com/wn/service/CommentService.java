package com.wn.service;

import com.entity.MyRsp;
import com.pojo.Comment;
import com.pojo.Movies;
import org.springframework.web.bind.annotation.RequestBody;

public interface CommentService {

    public Comment getComment( Movies movie);
}
