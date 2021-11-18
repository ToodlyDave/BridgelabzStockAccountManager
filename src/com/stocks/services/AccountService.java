package com.stocks.services;

import java.util.Scanner;

import com.stocks.entities.Account;

//Controls the amount in the bank account(Account class)
public class AccountService {
	
	Scanner scan = new Scanner(System.in);

	public static void credit(double credit_value) {
		
		double temp_amount = Account.getAmount();
		temp_amount += credit_value;
		Account.setAmount(temp_amount);
		System.out.println(" Updated amount: " + Account.getAmount());		
	}
	
	public static boolean debit(double debit_value) {
		
		if (Account.getAmount() - debit_value < 0) {
			System.out.println(" Insufficient funds!");
			return false;
		}
		
		double temp_amount = Account.getAmount();
		temp_amount -= debit_value;
		Account.setAmount(temp_amount);
		
		return true;
	}
}
