package com.xue.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @ApiOperation("测试用接口")
    @GetMapping("/hello")
    public String hello(){
        return "你好世界";
    }
}
