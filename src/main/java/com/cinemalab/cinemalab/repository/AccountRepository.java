package com.cinemalab.cinemalab.repository;

import com.cinemalab.cinemalab.entity.Account;
import com.cinemalab.cinemalab.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    //method --> sql --> derive query    findById(int id)

    //sql - @Query
    @Query(value = "SELECT * FROM accounts WHERE role = ?1", nativeQuery = true)
    List<Account> readAccountsByRole(Role role);

    //JPQL - @Query
    @Query("SELECT a FROM Account a WHERE a.id=?1")
    Optional<Account> getAccountDetails(Long accountId);

    //get account with email not equal
    @Query("SELECT a FROM Account a WHERE a.email <> ?1")
    Optional<Account> getAccountDetailsEmailNotEqual(String email);

    //get accounts with role
    @Query("SELECT a FROM Account a WHERE a.role = :role")
    List<Account> getAccountsWithRole(@Param("role") Role role);


    @Query("UPDATE Account a SET a.country = :country WHERE a.email = :email")
    @Modifying
    @Transactional
    void updateAccountCountryWithEmail(@Param("email") String email, @Param("country") String country);

    List<Account> retrieveAccountsByCountry(String country);




}
