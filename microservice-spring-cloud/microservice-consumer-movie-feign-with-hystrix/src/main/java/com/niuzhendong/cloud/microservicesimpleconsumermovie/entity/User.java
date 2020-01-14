package com.niuzhendong.cloud.microservicesimpleconsumermovie.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleconsumermovie.entity
 * @project_name microservice-simple-provider-user
 * @date 2019/11/22
 */
@Data
public class User {
    private Long id;

    private String username;

    private String name;

    private Short age;

    private BigDecimal balance;
}
