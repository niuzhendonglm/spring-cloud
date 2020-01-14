package com.niuzhendong.cloud.microservicesimpleconsumermovie.feign;

import com.niuzhendong.cloud.config.UserFeignClientConfiguration;
import com.niuzhendong.cloud.microservicesimpleconsumermovie.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleconsumermovie
 * @project_name microservice-spring-cloud
 * @date 2019/12/6
 */
@FeignClient(name = "microservice-provider-user",configuration = UserFeignClientConfiguration.class)
public interface UserFeignClient {

    @RequestLine("GET user/{id}")
    User findById(@Param("id") Long id);
}
