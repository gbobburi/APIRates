package com.exchange.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.exchange.Bean;

@Repository
public interface CurrentExchangeRateApiRepository extends JpaRepository<Bean, Long> {

	

    @Query( value = "SELECT  id,base_name ,rates_ofyear, january,february,march, april ,may ,june ,july , august,september ,october ,november ,decmber from  api_exchangerates" , nativeQuery = true)
    List<Bean> getAllExchangeRates();

   
}
