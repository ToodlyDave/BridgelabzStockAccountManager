package com.stocks.entities;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Account obj = new Account();
		while (true) {
			System.out.println(" 1. Credit\n 2. Debit\n 3. Print \n 4. Exit");
			System.out.print(" Please enter your choice: ");
			int ch = scan.nextInt();
			
			switch(ch) {
			case 1: 
				obj.credit();
				break;
			case 2:
				obj.debit();
				break;
			case 3:
				System.out.println(obj.getAmount() );
				break;
			case 4:
				return;
			default:
				System.out.println(" Please enter a valid input");
			}
		}
	}
}
