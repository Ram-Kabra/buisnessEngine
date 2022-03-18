package com.test.Demo;

import java.util.Scanner;

import com.test.Factory.PaymentFactory;
import com.test.Rule.Payment;

public class PaymentDemo {
	
	public static void main(String[] args) {
		StringBuffer paymentType = userInput();
		if((paymentType.toString()).equals("Exit")) {
			 System.out.println("Invalid choice, exiting");
			 System.exit(0);
		}else {
			performTask(paymentType);
			System.exit(0);
		}
	}

	private static void performTask(StringBuffer paymentType) {
		PaymentFactory pf = new PaymentFactory(paymentType.toString());
		Payment p = pf.getPaymentTypeObject();
		p.doTask();
	}

	private static StringBuffer userInput() {
		String choice,input = null;
		StringBuffer paymentType=null;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Choose payment for option between 1 and 5");
		System.out.println("1. Physical Product");
		System.out.println("2. Book");
		System.out.println("3. Membership");
		System.out.println("4. Upgrade");
		System.out.println("5. Video");
		System.out.println("0. Exit");
		choice = keyboard.nextLine();
		if(choice.matches("[1-5]+")) {
			input= choice;
		}else {
			input="0";
		}
		if (input.equals("1")) {
			paymentType = new StringBuffer("ProdPay");
		} else if (input.equals("2")) {
			paymentType = new StringBuffer("BookPay");
		} else if (input.equals("3")) {
			paymentType = new StringBuffer("MemPay");
		} else if (input.equals("4")) {
			paymentType = new StringBuffer("UpgMemPay");
		} else if (input.equals("5")) {
			paymentType = new StringBuffer("VideoPayment");
		} else {
			paymentType = new StringBuffer("Exit");
		}
		return paymentType;
	}

}
