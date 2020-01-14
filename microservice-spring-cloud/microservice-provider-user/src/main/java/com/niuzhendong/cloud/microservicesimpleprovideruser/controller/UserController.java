package com.niuzhendong.cloud.microservicesimpleprovideruser.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.niuzhendong.cloud.microservicesimpleprovideruser.entity.User;
import com.niuzhendong.cloud.microservicesimpleprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleprovideruser.controller
 * @project_name microservice-simple-provider-user
 * @date 2019/11/22
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("{id}")
    public User findById(@PathVariable Long id) {
        User user = userRepository.getOne(id);
        return user;
    }

    @GetMapping("eureka-instance")
    public String serviceUrl() {
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER", false);
        return instance.getHomePageUrl();
    }

    @GetMapping("instance-info")
    public List<ServiceInstance> showInfo() {
        List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVICE-PROVIDER-USER");
        return instances;
    }

    @PostMapping("postUser")
    public User postUser(@RequestBody User user) {
        return user;
    }

    @GetMapping("getUser")
    public User getUser(User user) {
        return user;
    }
}