package com.stocks.entities;

import java.util.Scanner;

//Contains the bank account info
public class Account {

	static double amount = 0;
	
	Scanner scan = new Scanner(System.in);
	
	public static double getAmount() {
		return amount;
	}

	public static void setAmount(double amount) {
		Account.amount = amount;
	}
	
}
