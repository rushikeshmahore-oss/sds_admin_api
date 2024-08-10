package com.cts.service;

import java.util.List;

import com.cts.binding.PlanForm;
import com.cts.binding.UserAccountForm;

public interface PlanService {
	
		//used by admin to create Scholorship plans for first time
		//CreatePlan Button is used
		public String createPlan(PlanForm planForm);
		
		
		//This method will be called when admin clicks on View Plans Button
		//This method will give us the list of Plans
		//Here we are not expecting any input, We are just displaying collection of plans.
		public List<PlanForm> fetchPlans();
		
		//This method is used to edit the plan details.
		//We are retriving the plan details by passing id as input.
		//This will appear when admin clicks on edit button.
		public PlanForm getPlanById(Integer planId);
		
		
		//This method is used to change the status of Plan(Activate/Deactivate)
		//Admin needs to click on right or cross symbol accordingly.
		public String changePlanStatus(Integer planId, String status);

}
