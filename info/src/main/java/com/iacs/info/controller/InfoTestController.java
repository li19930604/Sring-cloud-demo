package com.iacs.info.controller;

import com.iacs.info.service.IacsDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peicj
 * @Description: 测试控制器
 * @date 2019-06-12
 */
@RestController
@RequestMapping(value = "/test")
public class InfoTestController {

    @Autowired
    private IacsDataService iacsDataService;

    @GetMapping(value = "/getUser")
    public Object getUser(){
        Object obj = iacsDataService.getUser();
        return obj;
    }

}
