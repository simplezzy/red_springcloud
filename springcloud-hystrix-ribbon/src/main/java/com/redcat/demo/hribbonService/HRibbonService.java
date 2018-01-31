package com.redcat.demo.hribbonService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhiyu.zhou on 2018/1/31.
 */
@Service
public class HRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "indexError")
    public String indexService(String name) {
        return restTemplate.getForObject("http://service-provider/index?name=" + name, String.class);
    }

    public String indexError(String name) {
        return "hystrix ribbon" + name + "call error";
    }
}
