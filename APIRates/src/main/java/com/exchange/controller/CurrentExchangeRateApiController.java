package com.exchange.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.exception.DataNotFoundException;
import com.exchange.Bean;
import com.exchange.service.CurrentExchangeRateApiService;

@RestController
@RequestMapping("ExchangeRateAPIExample")
public class CurrentExchangeRateApiController {

	@Autowired
	private  CurrentExchangeRateApiService  apiservice;
	//DB Table checking
	//http://localhost:8080/ExchangeRateAPIExample/h2-console
	
	//listof rates
	//http://localhost:8080/ExchangeRateAPIExample/allRates
	
	@GetMapping
	@RequestMapping("/allRates")
	private List<Bean> getAllExchangeRates() throws DataNotFoundException{
		return apiservice.getAllExchangeRates();
		
	}
	
	//http://localhost:8080/ExchangeRateAPIExample/latest?currency=GBP&ratesOfYear=2020
	//http://localhost:8080/ExchangeRateAPIExample/latest?currency=USD&ratesOfYear=2020
	@GetMapping
	@RequestMapping("/latest")
	private List<Bean>  getRatesBasedOnCurrencyandyear(@RequestParam("currency")   String currency, @RequestParam("ratesOfYear") String ratesOfYear) throws DataNotFoundException {
		
		
		return apiservice.getRatesByCurrencyandyear(currency,ratesOfYear);
		
	}
	
}
