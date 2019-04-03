package com.gao.springcrud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

//    @RequestMapping("/login")
//    public String getIndex(){
//        return "login";
//    }
    @ResponseBody
    @RequestMapping("/hello")
    public String Get(){
        Logger logger = LoggerFactory.getLogger(IndexController.class);
        logger.info("hello");
        return "hello";
    }

}
