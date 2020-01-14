package com.niuzhendong.cloud.microservicesimpleprovideruser.controller;

import com.niuzhendong.cloud.microservicesimpleprovideruser.entity.User;
import com.niuzhendong.cloud.microservicesimpleprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleprovideruser.controller
 * @project_name microservice-simple-provider-user
 * @date 2019/11/22
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("{id}")
    public User findById(@PathVariable Long id) {
        User user = userRepository.getOne(id);
        return user;
    }
}
