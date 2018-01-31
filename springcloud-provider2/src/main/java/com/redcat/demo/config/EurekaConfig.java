package com.redcat.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhiyu.zhou on 2018/1/31.
 */
@Configuration
public class EurekaConfig {

    @Value("${server.port}")
    private String port;

    public String getPort() {
        return port;
    }

}
