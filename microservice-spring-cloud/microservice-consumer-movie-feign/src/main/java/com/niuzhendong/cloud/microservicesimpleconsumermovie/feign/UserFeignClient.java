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
@FeignClient("microservice-provider-user")
public interface UserFeignClient {

    @GetMapping("user/{id}")
    User findById(@PathVariable Long id);

    @PostMapping("user/postUser")
    User postUser(@RequestBody User user);

    /**
     * 如果传参是复杂对象，即使指定请求方式GET，feign也会用POST
     * @param user
     * @return
     */
    @GetMapping("user/getUser")
    User getUser(User user);
}
