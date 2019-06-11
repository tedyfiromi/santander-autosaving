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
		return goalRepository.save(goal);
	}

	@Override
	public void deleteGoal(Long idGoal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Goal getGoalById(String idGoal) {
		return goalRepository.getGoalById(idGoal);
	}

	@Override
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}

}
