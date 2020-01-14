package com.niuzhendong.cloud.microservicesimpleconsumermovie.feign;

import com.niuzhendong.cloud.config.BasicAuthRequestInterceptorConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleconsumermovie.feign
 * @project_name microservice-spring-cloud
 * @date 2019/12/6
 */
@FeignClient(name = "xxx",url = "http://localhost:8761/",configuration = BasicAuthRequestInterceptorConfiguration.class)
public interface ServiceInfoFeignClient {
    @GetMapping("eureka/apps/{serviceName}")
    String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);
}
