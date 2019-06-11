package com.santander.autosavings.middleware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.santander.autosavings.middleware.model.Goal;
import com.santander.autosavings.middleware.model.TransactionGoal;
import com.santander.autosavings.middleware.service.TransactionGoalService;
import com.santander.autosavings.middleware.utils.UrlRest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController(value="transactiongoalcontroller")
@RequestMapping(UrlRest.BASE)
@Api(value="Transaction Monetary")
public class TransactionGoalController {
	
	public static final String ADD_MONEY = "money/add";
	public static final String WITHDRAW_MONEY = "money/withdraw";
	
	@Autowired
	public TransactionGoalService transactionGoalService;
	
	@ApiOperation(value="Post add money transaction", response=String.class, notes="This operation save in mongodb a new transaction")
	@PostMapping(value=ADD_MONEY)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})
	public ResponseEntity<TransactionGoal> addMoney(
			@RequestParam("account") String account, 
			@RequestParam("idGoal") String idGoal,
			@RequestParam("addValue") double addValue) {		
		return ResponseEntity.ok(transactionGoalService.addMoney(account, idGoal, addValue)); 
	}
	
	
	@PostMapping(value=WITHDRAW_MONEY)
	public void withDrawMoney() {
		
		
	}	

}
