package com.cinemalab.cinemalab.repository;

import com.cinemalab.cinemalab.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    //method --> sql --> derive query    findById(int id)

    //sql - @Query

    //JPQL - @Query
}
