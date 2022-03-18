package com.test.RulesImpl;

import com.test.Rule.Payment;
import com.test.Utility.EmailUtility;

public class UpgradeMembershipPayment implements Payment{

	@Override
	public void doTask() {
		// Logic to upgrade membership
		System.out.println("Payment received for membership upgrade, membership upgraded");
		EmailUtility.sendEmail();
		
	}

}
