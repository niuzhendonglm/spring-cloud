package com.niuzhendong.cloud.microservicesimpleconsumermovie.feign;

import com.niuzhendong.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleconsumermovie.feign
 * @project_name microservice-spring-cloud
 * @date 2019/12/20
 */
@Component
public class UserFeignClientFallBack implements UserFeignClient{
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(0L);
        user.setName("失败啦");
        return user;
    }
}
