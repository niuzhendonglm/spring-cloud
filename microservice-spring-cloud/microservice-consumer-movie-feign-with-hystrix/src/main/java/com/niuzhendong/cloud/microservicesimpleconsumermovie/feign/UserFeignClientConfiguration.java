package com.niuzhendong.cloud.microservicesimpleconsumermovie.feign;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleconsumermovie.feign
 * @project_name microservice-spring-cloud
 * @date 2019/12/20
 */
@Configuration
public class UserFeignClientConfiguration {
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
