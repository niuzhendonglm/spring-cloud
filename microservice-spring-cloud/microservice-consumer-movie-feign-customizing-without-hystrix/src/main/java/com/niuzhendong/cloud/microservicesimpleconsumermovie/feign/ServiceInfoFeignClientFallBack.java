package com.niuzhendong.cloud.microservicesimpleconsumermovie.feign;

import org.springframework.stereotype.Component;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleconsumermovie.feign
 * @project_name microservice-spring-cloud
 * @date 2019/12/23
 */
@Component
public class ServiceInfoFeignClientFallBack implements ServiceInfoFeignClient{
    @Override
    public String findServiceInfoFromEurekaByServiceName(String serviceName) {
        return "haha";
    }
}
