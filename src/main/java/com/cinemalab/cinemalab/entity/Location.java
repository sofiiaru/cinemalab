package com.cinemalab.cinemalab.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Location extends BaseEntity{

    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String postalCode;
    private String country;
    private String city;
    private String address;



}
