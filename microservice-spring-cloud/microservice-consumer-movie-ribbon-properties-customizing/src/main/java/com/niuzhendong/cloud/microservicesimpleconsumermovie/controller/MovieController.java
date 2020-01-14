package com.niuzhendong.cloud.microservicesimpleconsumermovie.controller;

import com.niuzhendong.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("{id}")
    public User findById(@PathVariable Long id) {
        ServiceInstance serviceInstance1 = loadBalancerClient.choose("microservice-provider-user");
        System.out.println("===："+serviceInstance1.getServiceId()+"，host："+serviceInstance1.getHost()+"，post："+serviceInstance1.getPort());

        return restTemplate.getForObject("http://microservice-provider-user/user/"+id,User.class);
    }

    @GetMapping("test")
    public String test() {
        ServiceInstance serviceInstance1 = loadBalancerClient.choose("microservice-provider-user");

        System.out.println("111：instanceId："+serviceInstance1.getInstanceId()+"，serviceId："+serviceInstance1.getServiceId()+"，host："+serviceInstance1.getHost()+"，post："+serviceInstance1.getPort());

        ServiceInstance serviceInstance2 = loadBalancerClient.choose("microservice-provider-user2");
        System.out.println("222：instanceId："+serviceInstance2.getInstanceId()+"，serviceId："+serviceInstance2.getServiceId()+"，host："+serviceInstance2.getHost()+"，post："+serviceInstance2.getPort());
        return "success";
    }
}
