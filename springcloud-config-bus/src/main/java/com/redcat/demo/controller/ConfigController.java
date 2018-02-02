package com.redcat.demo.controller;

import com.redcat.demo.config.DisconfConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiyu.zhou on 2018/1/31.
 */
@RestController
public class ConfigController {

    @Autowired
    private DisconfConfig disconfConfig;

    @RequestMapping(value = "/config")
    public String index(){
        return disconfConfig.getName();
    }
}
