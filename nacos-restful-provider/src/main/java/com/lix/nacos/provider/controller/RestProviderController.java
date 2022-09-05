package com.lix.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiXiong
 * @Date: 2022-09-03 15:06
 * @Description:
 */
@RestController
public class RestProviderController {
    @GetMapping(value = "/service")
    public String service(){
        System.out.println("provider invoke");
        return "provider invoke";
    }
}
