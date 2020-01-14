package com.niuzhendong.cloud.microservicesimpleprovideruser.entity;

import lombok.Data;
import org.hibernate.annotations.Proxy;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author niuzhendong
 * @package_name com.niuzhendong.cloud.microservicesimpleprovideruser
 * @project_name microservice-simple-provider-user
 * @date 2019/11/22
 */
@Data
@Entity
@Proxy(lazy = false)
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private Short age;

    @Column
    private BigDecimal balance;
}
