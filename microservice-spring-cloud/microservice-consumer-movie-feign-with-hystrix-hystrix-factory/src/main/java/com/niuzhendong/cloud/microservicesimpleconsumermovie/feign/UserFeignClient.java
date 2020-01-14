package com.niuzhendong.cloud.microservicesimpleconsumermovie.feign;

import com.niuzhendong.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleconsumermovie
 * @project_name microservice-spring-cloud
 * @date 2019/12/6
 */
@FeignClient(name = "microservice-provider-user",configuration = UserFeignClientConfiguration.class/*,fallback = UserFeignClientFallBack.class*/,fallbackFactory = UserFeignClientFactory.class)
public interface UserFeignClient {

    @GetMapping("user/{id}")
    User findById(@PathVariable Long id);
}
