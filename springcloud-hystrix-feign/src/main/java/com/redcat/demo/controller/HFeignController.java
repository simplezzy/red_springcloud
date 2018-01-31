package com.redcat.demo.controller;

import com.redcat.demo.service.HFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiyu.zhou on 2018/1/31.
 */
@RestController
public class HFeignController {

    @Autowired
    private HFeignService hFeignService;

    @RequestMapping("/index")
    public String callFeignService(@RequestParam String name) {
        return hFeignService.indexFromClient(name);
    }

}
