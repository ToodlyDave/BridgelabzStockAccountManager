package com.stocks.entities;

import java.util.Scanner;

public class Account {

	double amount = 0;
	
	Scanner scan = new Scanner(System.in);
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void credit() {
		System.out.print(" Please enter the amount to credit: ");
		double credit_value = scan.nextDouble();
		
		amount += credit_value;
		System.out.println(" Updated amount: " + amount);		
	}
	
	public void debit() {
		System.out.print(" Please enter the amount to debit: ");
		double debit_value = scan.nextDouble();
		
		if (amount - debit_value < 0) {
			System.out.println(" Insufficient funds!");
			return;
		}
		
		amount -= debit_value;
		System.out.println(" Updated amount: " + amount);		
	}
	
}
