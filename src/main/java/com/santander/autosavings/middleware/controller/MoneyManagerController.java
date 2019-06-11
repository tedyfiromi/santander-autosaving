package com.santander.autosavings.middleware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santander.autosavings.middleware.service.MoneyManagerService;

import io.swagger.annotations.Api;

@RestController(value = "/api")
@Api(value="Money Managemment")
public class MoneyManagerController {
	
	public static final String ADD_MONEY = "money/add";
	public static final String WITHDRAW_MONEY = "money/withdraw";
	
	@Autowired
	public MoneyManagerService moneyManagerService;
	
	
	@PostMapping(value=ADD_MONEY)
	public void addMoney() {
		
		moneyManagerService.addMoney();

	}
	
	@PostMapping(value=WITHDRAW_MONEY)
	public void withDrawMoney() {
		
		moneyManagerService.withDrawMoney();
		
	}	

}
