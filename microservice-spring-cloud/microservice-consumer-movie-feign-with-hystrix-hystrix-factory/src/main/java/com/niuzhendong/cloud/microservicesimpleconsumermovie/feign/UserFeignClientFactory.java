package com.niuzhendong.cloud.microservicesimpleconsumermovie.feign;

import com.niuzhendong.cloud.microservicesimpleconsumermovie.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleconsumermovie.feign
 * @project_name microservice-spring-cloud
 * @date 2019/12/24
 */
@Component
public class UserFeignClientFactory implements FallbackFactory<UserFeignClient> {
    @Override
    public UserFeignClient create(Throwable throwable) {
        return (UserFeignClientWithFactory) id -> {
            User user = new User();
            user.setId(-1L);
            return user;
        };
    }
}
