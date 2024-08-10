package com.cts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.binding.UnlockAccountForm;
import com.cts.binding.UserAccountForm;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public String createUserAccount(UserAccountForm accForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccountForm> fetchUserAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAccountForm getUserAccById(Integer accId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeAccStatus(Integer accId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unlockUserAccount(UnlockAccountForm unlockAccountForm) {
		// TODO Auto-generated method stub
		return null;
	}

}
