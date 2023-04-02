package com.glearning.service;

import java.util.ArrayList;
import java.util.List;

public class CurrencyDem {
public static void Currencycount(int demo[],double amount) {
	boolean flag = true;
List<String> result = new ArrayList<>();
while(flag) {
	for (int i =0 ; i<demo.length;i++) {
		int numberdemo = 0;
		while(amount>=numberdemo) {
			amount = amount-demo[i];
			numberdemo++;
			
		}
		if(numberdemo !=0) {
			result
			.add("Number of denominators :: " + numberdemo + "Currency ::" );
		}
		
	}
flag = false;
}
System.out.println(result);
	
		}
}
