package com.niuzhendong.cloud.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.config
 * @project_name microservice-spring-cloud
 * @date 2019/12/6
 */
@Configuration
public class UserFeignClientConfiguration {
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
