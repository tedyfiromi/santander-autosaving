package com.santander.autosavings.middleware.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.santander.autosavings.middleware.model.Goal;

@Repository
public class GoalRepositoryImpl implements GoalRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<Goal> listGoals() {
		return mongoTemplate.findAll(Goal.class);
	}

	@Override
	public Goal insert(Goal goal) {
		return mongoTemplate.save(goal);
	}

	@Override
	public Goal update(Goal goal) {
		return mongoTemplate.save(goal);
	}

	@Override
	public void delete(Long idGoal) {
		// TODO Auto-generated method stub

	}

	@Override
	public Goal getGoalById(String idGoal) {
		return mongoTemplate.findById(idGoal, Goal.class);
	}

	@Override
	public Goal save(Goal goal) {
		return mongoTemplate.save(goal);
	}

}
