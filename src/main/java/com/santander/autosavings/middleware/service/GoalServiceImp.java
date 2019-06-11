package com.santander.autosavings.middleware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.autosavings.middleware.model.Goal;
import com.santander.autosavings.middleware.repository.GoalRepository;

@Service
public class GoalServiceImp implements GoalService{
	
	@Autowired
	public GoalRepository goalRepository;

	@Override
	public List<Goal> getListGoal() {
		return goalRepository.listGoals();
	}

	@Override
	public Goal createGoal(Goal goal) {
		return goalRepository.insert(goal);
	}

	@Override
	public Goal updateGoal(Goal goal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGoal(Long idGoal) {
		// TODO Auto-generated method stub
		
	}

}
