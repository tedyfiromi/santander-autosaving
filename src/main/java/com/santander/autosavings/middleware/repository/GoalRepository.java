package com.santander.autosavings.middleware.repository;

import java.util.List;

import com.santander.autosavings.middleware.model.Goal;

public interface GoalRepository {
	
	public List<Goal> listGoals();
	
	public Goal insert(Goal goal);
	
	public Goal update(Goal goal);
	
	public void delete(Long idGoal);

}
