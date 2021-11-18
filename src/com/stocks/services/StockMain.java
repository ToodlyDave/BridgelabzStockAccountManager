package com.stocks.services;

import java.util.Scanner;

public class StockMain {

	public static void main(String[] args) {
		System.out.println(" Welcome to the stock account manager!");
		
		Scanner scan = new Scanner(System.in);
		StockAccount objStockAccount = new StockAccount();
//		objManager.createPortfolio();
//		objManager.printPortfolio();
		
		while(true) {
			System.out.println(" 1. Buy Shares\n 2. Sell Shares\n "
					+ "3. Credit Account\n 4. Debit Account\n "
					+ "5. Print Account Balance\n 6. Print Portfolio Details\n 7. Exit");
			System.out.print(" Please enter your choice: ");
			int ch = scan.nextInt();
			int amount;
			String symbol;
			switch(ch) {
			case 1:
				System.out.print(" Please enter which stock you want to buy: ");
				symbol = scan.next();
				System.out.print(" Please enter how much to be spent on shares: ");
				amount = scan.nextInt();
				objStockAccount.buy(amount, symbol);
				break;
			case 2:
				System.out.print(" Please enter which stock you want to sell: ");
				symbol = scan.next();
				System.out.print(" Please enter value of worth of shares to be sold: ");
				amount = scan.nextInt();
				objStockAccount.sell(amount, symbol);
				break;
			case 3:
				System.out.println(" Please enter how much you want to credit into account: ");
				amount = scan.nextInt();
				AccountService.credit(amount);
				break;
			case 4:
				System.out.println(" Please enter how much you want to debit from account: ");
				amount = scan.nextInt();
				AccountService.debit(amount);
				break;
			case 5: 
				objStockAccount.valueOf();
				break;
			case 6: 
				objStockAccount.printReport();
				break;
			case 7:
				System.out.println(" Good bye!");
				return;
			default:
				System.out.println(" Please enter a valid choice");
				
			}
		}
	}
}
