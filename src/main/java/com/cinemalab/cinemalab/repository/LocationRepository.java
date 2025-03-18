package com.cinemalab.cinemalab.repository;

import com.cinemalab.cinemalab.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Long> {

    //Display all locations in USA
    //find, get, read    By
    List<Location> findByCountry(String country);//select * from locations where country = "country"

    //same but with no duplicates
    List<Location> findDistinctByCountry(String country);

    //display all locations with country name includes 'United'
    List<Location> findByCountryContaining(String country);

    //display all locations with country name includes 'United' in order
    List<Location> findByCountryContainingOrderByCity(String country);

    //display top 2 locations in canada
    List<Location> findTop2ByCountry(String country);





}
