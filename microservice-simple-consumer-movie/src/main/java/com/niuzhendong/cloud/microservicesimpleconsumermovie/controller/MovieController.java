package com.niuzhendong.cloud.microservicesimpleconsumermovie.controller;

import com.niuzhendong.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleconsumermovie.controller
 * @project_name microservice-simple-provider-user
 * @date 2019/11/22
 */
@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("{id}")
    public User findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://localhost:7900/user/"+id,User.class);
    }
}
