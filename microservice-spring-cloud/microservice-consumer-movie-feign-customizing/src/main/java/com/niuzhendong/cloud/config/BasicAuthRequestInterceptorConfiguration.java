package com.niuzhendong.cloud.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.config
 * @project_name microservice-spring-cloud
 * @date 2019/12/6
 */
@Configuration
public class BasicAuthRequestInterceptorConfiguration {
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin","admin");
    }
}
