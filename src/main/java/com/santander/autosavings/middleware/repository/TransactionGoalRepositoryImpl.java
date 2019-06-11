package com.santander.autosavings.middleware.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.santander.autosavings.middleware.model.TransactionGoal;

@Repository
public class TransactionGoalRepositoryImpl implements TransactionGoalRepository{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public TransactionGoal save(TransactionGoal transaction) {
		return mongoTemplate.save(transaction);
	}

}
