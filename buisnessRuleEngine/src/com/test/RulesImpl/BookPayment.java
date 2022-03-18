package com.test.RulesImpl;

import com.test.Rule.Payment;
import com.test.Utility.CommissionUtility;

public class BookPayment implements Payment{

	@Override
	public void doTask() {
		// Logic to create duplicate packing slip
		System.out.println("Payment for Book received, duplicate packing slip generated for Royalty department");
		CommissionUtility.generateCommission();
	}

}
