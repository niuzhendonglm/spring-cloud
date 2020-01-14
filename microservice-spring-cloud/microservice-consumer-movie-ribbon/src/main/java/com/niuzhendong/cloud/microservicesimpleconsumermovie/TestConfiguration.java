package com.niuzhendong.cloud.microservicesimpleconsumermovie;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleconsumermovie
 * @project_name microservice-spring-cloud
 * @date 2019/12/2
 */
@Configuration
@ExcludeFromComponentScan
public class TestConfiguration {

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
