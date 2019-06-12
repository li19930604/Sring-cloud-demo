package com.iacs.data.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peicj
 * @Description: 测试控制器(这里用一句话描述这个类的作用)
 * @date 2019-06-12
 */
@RestController
@RequestMapping(value = "/test")
public class DataTestController {

    @GetMapping(value = "/getUser")
    public Object getUser(){
        Map map = new HashMap();
        map.put("userName","admin");
        map.put("password","123456");
        return map;
    }
}
