package com.redcat.demo.service;

import org.springframework.stereotype.Component;

/**
 * Created by zhiyu.zhou on 2018/1/31.
 */
@Component
public class HFeignServiceHystrix implements HFeignService {

    @Override
    public String indexFromClient(String name) {
        return "call error!" + name;
    }
}
