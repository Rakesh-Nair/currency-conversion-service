package com.spring.microservices.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservices.bean.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		return new CurrencyConversionBean(1L, from, to, BigDecimal.ONE, quantity, BigDecimal.TEN, 8010);
	}
}
