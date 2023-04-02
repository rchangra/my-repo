package com.glearning.client;

import com.glearning.service.TransactionService;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Transaction");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the number of value of array");
		for (int i=0;i<size;i++)
			arr [i] =sc.nextInt();
		System.out.println("enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();
		
	while (targetNo--!=0) {
		int flag =0;
		int target;
		System.out.println("Enter the value Target");
		target = sc.nextInt();
		
	}

		TransactionService TransactionService = new TransactionService();
		int [] inputTransactions = new int[] {100,200,400,500,1200};
		int target = 500;
		TransactionService.checktransaction(inputTransactions, target);
		

	}
}

