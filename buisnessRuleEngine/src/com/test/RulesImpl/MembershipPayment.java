package com.test.RulesImpl;

import com.test.Rule.Payment;
import com.test.Utility.EmailUtility;

public class MembershipPayment implements Payment{

	@Override
	public void doTask() {
		// Logic to activate membership
		System.out.println("Payment received for membership activation, membership activated");
		EmailUtility.sendEmail();
		
	}

}
