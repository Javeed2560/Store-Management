package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.CountriesCurrency;

@Repository
public interface CountriesCurrencyRepository extends JpaRepository<CountriesCurrency, Long> {

}
