package com.redcat.demo.controller;

import com.redcat.demo.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiyu.zhou on 2018/1/31.
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("/index")
    public String ribbonIndex(@RequestParam String name) {
        return ribbonService.indexService(name);
    }
}
