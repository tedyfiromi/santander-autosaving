package com.santander.autosavings.middleware.service;

import java.util.List;

import com.santander.autosavings.middleware.model.Goal;


public interface GoalService {
	
	public List<Goal> getListGoal();
	
	public Goal createGoal(Goal goal);
	
	public Goal updateGoal(Goal goal);
	
	public void deleteGoal(Long idGoal);

	public Goal getGoalById(String idGoal);
	
	public Goal save(Goal goal);

}
