package com.cinemalab.cinemalab.entity;

import com.cinemalab.cinemalab.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

@Entity
@Table(name = "account_details")
@NoArgsConstructor
@Data
public class Account extends BaseEntity{

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    @OneToOne(mappedBy = "account")
    private User user;
}
