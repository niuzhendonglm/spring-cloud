package com.niuzhendong.microservicediscoveryeureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.microservicediscoveryeureka.controller
 * @project_name config-learning
 * @date 2020/1/13
 */
@org.springframework.web.bind.annotation.RestController
@RefreshScope
public class RestController {

    @Value("${profile}")
    private String profile;

    @GetMapping("profile")
    public String getProfile() {
        return this.profile;
    }
}
