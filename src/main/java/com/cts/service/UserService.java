package com.cts.service;

import com.cts.binding.DashboardCard;
import com.cts.binding.LoginForm;

public interface UserService {
	
	
	//This method will check user credentials
	public String login(LoginForm loginForm);
	
	//this method will send recoverypass to user after checking the provided mail is registered or not
	public boolean recoverPwd(String email);
	
	//after sucessful login this method will provide info displayed in cards 
	public DashboardCard fetchDashobardInfo();
	


}
