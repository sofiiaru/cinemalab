package com.cinemalab.cinemalab.repository;

import com.cinemalab.cinemalab.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
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

    //findDistinctTop3ByDivisionContaining(String pattern)

    //display all employees with email address "gmail.com"
    //findByEmailEnding(String domain)

    //display all employees with first name " " and last name " ", also show all employees with an email address
    //findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //display all employees that first name is not "Simon"
    //findByFirstNameIsNot(String firstName)

    //display all employees where last name starts with "Sim"
    //findByLastNameStartsWith(String lastName)

    //display all employees with salaries less than or equal '100 000'
    //findBySalaryLessThanEqual(Integer salary)

    //display all employees that has been hired between dates " " and " "
    //findByHireDateBetween(LocalDate startDate, LocalDate endDate)

    //display all employees who don't have email address
    //findByEmailIsNull

    //find all courses by category and Order entities by name
    //findByCategoryOrderByName(String category)

    //check if a course with provided name exists
    //boolean existsByName(String name)

    //return the count of courses for the provided category
    //int countByCategory(String category)

    //find all courses that start with provided course name
    //findAllByNameStartsWith(String name)

    //find all courses by category and returns a stream
    //Stream<Course> streamByCategory(String category)

    //












}
