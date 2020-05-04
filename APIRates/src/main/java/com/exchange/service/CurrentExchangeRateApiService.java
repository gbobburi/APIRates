package com.exchange.service;

import java.util.List;

import com.demo.exception.DataNotFoundException;
import com.exchange.Bean;

public interface CurrentExchangeRateApiService {

	List<Bean> getAllExchangeRates() throws DataNotFoundException;

	List<Bean> getRatesByCurrencyandyear(String currency, String ratesOfYear) throws DataNotFoundException;

	
}
