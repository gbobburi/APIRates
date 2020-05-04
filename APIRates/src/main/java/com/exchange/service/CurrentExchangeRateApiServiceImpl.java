package com.exchange.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.exception.DataNotFoundException;
import com.exchange.Bean;
import com.exchange.repository.CurrentExchangeRateApiRepository;

@Service
public class CurrentExchangeRateApiServiceImpl implements CurrentExchangeRateApiService {

	@Autowired
	private CurrentExchangeRateApiRepository apirepository;
	private List<Bean> allExchangeRates;

	@Override
	public List<Bean> getAllExchangeRates() throws DataNotFoundException {
		// TODO Auto-generated method stub

		List<Bean> list = apirepository.findAll();
		if (!list.isEmpty()) {
			return list;
		} else {
			throw new DataNotFoundException("there is no Data in table ");
		}
	}

	@Override
	public List<Bean> getRatesByCurrencyandyear(String currency, String ratesOfYear) throws DataNotFoundException {
		// TODO Auto-generated method stub

		List<Bean> bean = new ArrayList<Bean>();
		;
		boolean rateflag = false;
		allExchangeRates = getAllExchangeRates();
		if (!allExchangeRates.isEmpty()) {
			for (Bean bean2 : allExchangeRates) {
				if (bean2.getRatesOfyear().equals(ratesOfYear) && bean2.getBaseName().equals(currency)) {

					bean.add(bean2);
					rateflag = true;
				}
			}
			if (rateflag = true && !bean.isEmpty()) {
				return bean;
			} else {
				throw new DataNotFoundException("there is  no data found with given base name and rate of year");
			}

		} else {
			throw new DataNotFoundException("there is no Data in Table");
		}
	}

}
