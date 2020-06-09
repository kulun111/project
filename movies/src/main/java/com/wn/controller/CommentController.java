package com.wn.controller;

import com.entity.MyRsp;
import com.pojo.Movies;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @RequestMapping("/getComment")
    public MyRsp getComment(@RequestBody Movies movie){

        return null;
    }
}
