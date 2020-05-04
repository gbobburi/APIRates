package com.exchange.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exchange.Bean;
import com.exchange.repository.CurrentExchangeRateApiRepository;

@Service
public class CurrentExchangeRateApiServiceImpl implements CurrentExchangeRateApiService {

	@Autowired
	private CurrentExchangeRateApiRepository apirepository;
	private List<Bean> allExchangeRates;

	@Override
	public List<Bean> getAllExchangeRates() {
		// TODO Auto-generated method stub
	
				List<Bean> list = apirepository.findAll();
				return list;
	}

	@Override
	public List<Bean> getRatesByCurrencyandyear(String currency, String ratesOfYear) {
		// TODO Auto-generated method stub
		List<Bean> bean= new ArrayList<Bean>();
		
		allExchangeRates = getAllExchangeRates();
		for (Bean bean2 : allExchangeRates) {
			if(bean2.getRatesOfyear().equals(ratesOfYear) && bean2.getBaseName().equals(currency)) {
						
				 bean.add(bean2);				
				
			}
		}
		return bean;
	}
	
	
}
