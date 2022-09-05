package com.lix.nacos.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: LiXiong
 * @Date: 2022-09-03 15:20
 * @Description:
 */
@RestController
public class controllerRestConsumerController {
    @Value("${provider.address}")
    private String provider;

    @GetMapping(value = "/service")
    public String service(){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://" + provider + "/service", String.class);
        return  "consumer invoke |"+result;
    }
}
