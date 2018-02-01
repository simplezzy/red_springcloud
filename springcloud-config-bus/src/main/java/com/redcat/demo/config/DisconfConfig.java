package com.redcat.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhiyu.zhou on 2018/1/31.
 */
@Configuration
public class DisconfConfig {

    @Value("${redcat}")
    private String name;

    public String getName() {
        return name;
    }
}
