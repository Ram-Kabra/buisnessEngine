package com.test.RulesImpl;

import com.test.Rule.Payment;
import com.test.Utility.CommissionUtility;

public class PhysicalProductPayment implements Payment{

	@Override
	public void doTask() {
		// Logic to generate the packing slip
		System.out.println("Payment for Physical Product, packing slip generated");
		CommissionUtility.generateCommission();
		
	}

}
