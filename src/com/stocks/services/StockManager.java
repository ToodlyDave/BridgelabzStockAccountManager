package com.stocks.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.stocks.entities.Portfolio;
import com.stocks.entities.Stock;

public class StockManager {
	
	Scanner scan = new Scanner(System.in);

	public void createPortfolio() {
		System.out.print(" Please enter the number of stock in your possession: ");
		int n = scan.nextInt();
		
		ArrayList<Stock> temp = Portfolio.getStocks();
		int value = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("\n Please enter the name of the stock: ");
			String name = scan.next();
			
			System.out.print(" Please enter the number of shares: ");
			int no_of_shares = scan.nextInt();
			
			System.out.print(" Please enterh the value of each share: ");
			double price_of_share = scan.nextDouble();
			
			Stock newStock = new Stock(name, no_of_shares, price_of_share);
			
			newStock.setTotal_value_of_shares(price_of_share * no_of_shares);
			temp.add(newStock);		
			
			value += newStock.getTotal_value_of_shares();
		}
		
		Portfolio.setTotal_value(value);
		Portfolio.setStocks(temp);
	}
	
	public void printPortfolio() {
		
		ArrayList<Stock> stocks = Portfolio.getStocks();
		
		for (Stock stock : stocks) {
			System.out.println(stock);
		}
		
		System.out.println(" Total value of this account: " + Portfolio.getTotal_value());
	}
	
	
}
