package com.freetek.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by panther.dongdong on 2016/4/20.
 */
@Controller
public class HelloController {
    public static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello.json")
    @ResponseBody
    public String sayHello() {
        logger.info("hello word");
        return "hello word";
    }

    @RequestMapping("/helloPage.json")
    public String getHello() {
        return "hello.html";
    }
}

