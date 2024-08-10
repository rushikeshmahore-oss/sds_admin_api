package com.cts.service;

import java.util.List;

import com.cts.binding.UnlockAccountForm;
import com.cts.binding.UserAccountForm;


public interface AccountService {
	
	//used by admin to create account for StudentOfficer for first time
	//CreateAccount Button is used
	public String createUserAccount(UserAccountForm accForm	);
	
	
	//This method will be called when admin clicks on View Accounts Button
	//This method will give us the list of StudentOfficer accounts
	//Here we are not expecting any input, We are just displaying collection of accounts.
	public List<UserAccountForm> fetchUserAccounts();
	
	//This method is used to edit the StudentOfficer account details.
	//We are retriving the StudentOfficer acc details by passing id as input.
	//This will appear when admin clicks on edit button.
	public UserAccountForm getUserAccById(Integer accId);
	
	
	//This method is used to change the status of StudentOfficer Account(Activate/Deactivate)
	//Admin needs to click on right or cross symbol accordingly.
	public String changeAccStatus(Integer accId, String status);
	
	
	public String unlockUserAccount(UnlockAccountForm unlockAccountForm);
	
	

}
