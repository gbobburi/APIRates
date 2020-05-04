package com.exchange.service;

import java.util.List;

import com.exchange.Bean;

public interface CurrentExchangeRateApiService {

	List<Bean> getAllExchangeRates();

	List<Bean> getRatesByCurrencyandyear(String currency, String ratesOfYear);

	
}
