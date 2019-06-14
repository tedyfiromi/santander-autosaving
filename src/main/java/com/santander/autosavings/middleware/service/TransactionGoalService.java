package com.santander.autosavings.middleware.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.santander.autosavings.middleware.model.AddMoneyObject;
import com.santander.autosavings.middleware.model.Goal;
import com.santander.autosavings.middleware.model.TransactionGoal;
import com.santander.autosavings.middleware.repository.TransactionGoalRepository;

@Service
public class TransactionGoalService {
	

	@Autowired
	private TransactionGoalRepository transactGoalRepository;
	
	public final static String URI_GOALS = "http://localhost:8090/santander/goal/list";
	public final static String GOAL_BY_ID = "http://localhost:8090/santander/goal/{id}";
	public final static String GOAL_CREATE = "http://localhost:8090/santander/goal/create";
	
//	@Autowired
//	private GoalService goalService;
	
	
		public TransactionGoal addMoney(AddMoneyObject addTransaction) {		
		
		double addValue = addTransaction.getAddValue();
		String account = addTransaction.getAccount();
		
		if (amountIsAvailable(addValue, account)) {	
			
			Goal goal = clientGoalById(addTransaction);
			
			double salvedMoney = goal.getSaved();
			
			List<TransactionGoal> listTransactions;
			TransactionGoal transact = new TransactionGoal();
			
			listTransactions = listTransactionsNeverNull(goal.getTransactionGoals());	
			
			transact.setAccount(account);
			transact.setValue(addValue);
			
			TransactionGoal transaction = transactGoalRepository.save(transact);			
			listTransactions.add(transaction);
			
			goal.setSaved(sumAddValue(salvedMoney, addValue));
			
			goal.setTransactionGoal(listTransactions);			
			
			clientSaveGoal(goal);
			
			return transaction;
		}
		return null;
	}

	public double totalAmount(String acount) {

		double available = 5000.00;

		return available;
	}
	
	public double sumAddValue(double salvedMoney, double addValue) {
		return salvedMoney = salvedMoney + addValue;
	}
	
	public boolean amountIsAvailable(double addValue, String account) {		
		return totalAmount(account) > addValue;
	}
	
	public List<TransactionGoal> listTransactionsNeverNull(List<TransactionGoal> listTransactions) {
		return listTransactions == null?new ArrayList<>():listTransactions;
	}
	
	public Goal clientGoalById(AddMoneyObject addTransaction) {	
		HashMap<String, String> params = new HashMap<String, String>();
	    params.put("id", addTransaction.getIdGoal());
		
		RestTemplate restTempGoalId = new RestTemplate();
		return restTempGoalId.getForObject(GOAL_BY_ID, Goal.class, params);	
	}
	
	public Goal clientSaveGoal(Goal goal) {		
		RestTemplate restTempGoalId = new RestTemplate();
		return restTempGoalId.postForObject(GOAL_CREATE, goal, Goal.class);	
	}
	

}
