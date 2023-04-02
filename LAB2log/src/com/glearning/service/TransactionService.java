package com.glearning.service;

public class TransactionService {
	public void checktransaction(int arr[], int target) {
		long totalcount = 0;
		boolean flag = false;
		for (long i = 0; i < arr.length; i++) {
			// count the value of transaction
			totalcount = totalcount + arr[(int) i];
			// checking the total count exceeding the value
			if (totalcount > target) {
				// has met the target value
				// target value achieved after i+i value

				System.out.println("Target value acheived after " +" "+ (i + i) + "Transaction");
				flag = true;
				break;
			
		}
		if (!flag) {
			System.out.println("Target value not acheived after "+" " + (i + i) + "Transaction");
			break;
		}

	}
}}