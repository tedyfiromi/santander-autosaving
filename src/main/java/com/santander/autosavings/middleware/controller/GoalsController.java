package com.santander.autosavings.middleware.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.santander.autosavings.middleware.model.Goal;
import com.santander.autosavings.middleware.response.Response;
import com.santander.autosavings.middleware.service.GoalService;
import com.santander.autosavings.middleware.utils.UrlRest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController(value = "goalscontroller")
@RequestMapping(UrlRest.BASE)
@Api(value="Goal Managemment")
public class GoalsController {
	
	@Autowired
	public GoalService goalService;

	
	@ApiOperation(value="List of Goals", response=String.class, notes="This operation return the list of all goals")
    @GetMapping(value = UrlRest.GOAL_LIST)
    public ResponseEntity<List<Goal>> getListGoals() {
        return ResponseEntity.ok(goalService.getListAllGoals());
    }
	
	@ApiOperation(value="Create Goal", response=String.class, notes="This operation be create a new goal")
	@PostMapping(value = UrlRest.GOAL_CREATE)
	public ResponseEntity<Response<Goal>> createGoal(@RequestBody Goal goal) {
		
		Response<Goal> response = new Response<Goal>();		
		response.setData(goalService.insertGoal(goal));
				
		return ResponseEntity.ok(response);
	}
	
	@ApiOperation(value="Get Goal By Id", response=String.class, notes="This operation find Goal by idGoal")
	@GetMapping(value = UrlRest.FIND_GOAL_BY_ID)
	public ResponseEntity<Goal> getGoalById(@PathVariable("id") String id) {
		return ResponseEntity.ok(goalService.findGoalById(id));
	}
	
	@ApiOperation(value="Update Goal", response=String.class, notes="This operation be create a new goal")
	@PostMapping(value = UrlRest.GOAL_UPDATE)
	public ResponseEntity<Response<Goal>> updateGoal(@RequestBody Goal goal) {
		
		Response<Goal> response = new Response<Goal>();		
		response.setData(goalService.updateGoal(goal));
				
		return ResponseEntity.ok(response);
	}
	
	
}
