package com.niuzhendong.cloud.microservicesimpleprovideruser.repository;

import com.niuzhendong.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleprovideruser.repository
 * @project_name microservice-simple-provider-user
 * @date 2019/11/22
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
