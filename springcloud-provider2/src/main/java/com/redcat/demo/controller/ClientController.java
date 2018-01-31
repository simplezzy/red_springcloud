package com.redcat.demo.controller;

import com.redcat.demo.config.EurekaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhiyu.zhou on 2018/1/31.
 */
@RestController
public class ClientController {

    @Autowired
    private EurekaConfig eurekaConfig;

    @RequestMapping("/index")
    public String ClientIndex(@RequestParam("name") String name) {
        return new Date() + "index" + name +  "--from port:" + eurekaConfig.getPort();
    }
}
