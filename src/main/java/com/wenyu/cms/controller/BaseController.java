package com.wenyu.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:wenyu
 * 2021/4/29
 */
@Controller
public class BaseController {


    @RequestMapping("index")
    private String index(){

        return "index";
    }
}
