package com.redcat.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhiyu.zhou on 2018/1/31.
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String indexService(String name) {
        return restTemplate.getForObject("http://service-provider/index?name=" + name, String.class);
    }
}
