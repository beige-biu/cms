package com.wenyu.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:wenyu
 * 2021/4/29
 */
@Controller
public class BaseController {


    @RequestMapping("/")
    private String index(){

        return "index";
    }

    @RequestMapping("/login")
    private String login(){

        return "login";
    }


}
