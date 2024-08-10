package com.cts.service;

import org.springframework.stereotype.Service;

import com.cts.binding.DashboardCard;
import com.cts.binding.LoginForm;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String login(LoginForm loginForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean recoverPwd(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DashboardCard fetchDashobardInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
