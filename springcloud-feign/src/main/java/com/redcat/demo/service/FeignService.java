package com.redcat.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhiyu.zhou on 2018/1/31.
 */
@FeignClient("service-provider")
public interface FeignService {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String indexFromClient(@RequestParam("name") String name);
}
