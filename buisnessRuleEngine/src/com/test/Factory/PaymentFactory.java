package com.test.Factory;

import com.test.Rule.Payment;
import com.test.RulesImpl.BookPayment;
import com.test.RulesImpl.MembershipPayment;
import com.test.RulesImpl.PhysicalProductPayment;
import com.test.RulesImpl.UpgradeMembershipPayment;
import com.test.RulesImpl.VideoLearningToSkiPayment;

public class PaymentFactory implements Payment {
	
	public static Payment p;
	public static final String BOOK_PAYMENT="BookPay";
	public static final String PRODUCT_PAYMENT="ProdPay";
	public static final String MEMBERSHIP_PAYMENT="MemPay";
	public static final String UPGRADE_MEMBERSHIP_PAYMENT="UpgMemPay";
	public static final String VIDEO_PAYMENT="VideoPayment";

	public PaymentFactory(String paymentFor) {
		
		if(paymentFor.equals(BOOK_PAYMENT)) {
			p = new BookPayment();
		}
		else if(paymentFor.equals(PRODUCT_PAYMENT)) {
			p = new PhysicalProductPayment();
		}
		else if(paymentFor.equals(MEMBERSHIP_PAYMENT)) {
			p = new MembershipPayment();
		}
		else if(paymentFor.equals(UPGRADE_MEMBERSHIP_PAYMENT)) {
			p = new UpgradeMembershipPayment();
		}
		else if(paymentFor.equals(VIDEO_PAYMENT)) {
			p = new VideoLearningToSkiPayment();
		}
	}

	@Override
	public void doTask() {
	}
	
	public Payment getPaymentTypeObject() {
		return p;
	}

}
