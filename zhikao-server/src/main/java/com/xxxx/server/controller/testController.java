package com.xxxx.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author rui on 2022/2/9
 */

@RestController
public class testController {
    @GetMapping("hello")
    public String hello(){
        return "hello sdhk";
        
    }
}
