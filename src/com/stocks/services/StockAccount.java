package com.stocks.services;
import java.util.ArrayList;
import java.util.Scanner;

import com.stocks.entities.Account;
import com.stocks.entities.AccountInterface;
import com.stocks.entities.Portfolio;
import com.stocks.entities.Stock;


//controls the transactions of shares in the portfolio, prints amount in bank account, prints stock report
public class StockAccount implements AccountInterface {
	
	Scanner scan = new Scanner(System.in);

	@Override
	public double valueOf() {
		// TODO Auto-generated method stub
		
		System.out.println(" The account balance: " + Account.getAmount());
		return Account.getAmount();
	}
	
	public Stock findStock(String name) {
		ArrayList<Stock> temp = Portfolio.getStocks();
		
		for (Stock stock : temp) {
			if(stock.getName().equals(name)) {
				return stock;
			}
		}
		
		return null;
	}
	
	public Stock createStock(String name) {
		ArrayList<Stock> temp = Portfolio.getStocks();
		
		System.out.print(" Please enter the value of each share: ");
		double price_of_share = scan.nextDouble();
		
		Stock newStock = new Stock(name, 0, price_of_share);
		
		newStock.setTotal_value_of_shares(0);
		temp.add(newStock);		
		
		Portfolio.setStocks(temp);
		
		return newStock;
	}

	@Override
	public void buy(int amount, String symbol) {
		// TODO Auto-generated method stub
		
		if (amount > Account.getAmount()) {
			System.out.println(" Insufficient funds!");
			return;
		}
		
		Stock stock = findStock(symbol);
		
		if (stock == null) {
			stock = createStock(symbol);
		}
		
		int no_of_shares = (int)(amount / stock.getPrice_of_share());
		double spending_value = no_of_shares * stock.getPrice_of_share();
		AccountService.debit(spending_value);
		
		System.out.println(" Spending " + spending_value + " to buy " + no_of_shares + " shares");
		
		valueOf();
		
		stock.setNo_of_shares(no_of_shares + stock.getNo_of_shares());
		stock.setTotal_value_of_shares(stock.getNo_of_shares() * stock.getPrice_of_share());
		
	}

	@Override
	public void sell(int amount, String symbol) {
		// TODO Auto-generated method stub
		
		Stock stock = findStock(symbol);
		
		if (stock == null) {
			System.out.println(" You do not possess this stock!");
			return;
		}
		
		int no_of_shares = (int)(amount / stock.getPrice_of_share());
		
		if(no_of_shares > stock.getNo_of_shares()) {
			no_of_shares = stock.getNo_of_shares();
		}
		
		stock.setNo_of_shares(stock.getNo_of_shares() - no_of_shares);
		
		double stock_value = stock.getNo_of_shares() * stock.getPrice_of_share();
		stock.setTotal_value_of_shares(stock_value);
		
		double credit_value = stock.getPrice_of_share() * no_of_shares;
		AccountService.credit(credit_value);
		
		

	}

	@Override
	public void printReport() {
		// TODO Auto-generated method stub
		ArrayList<Stock> temp = Portfolio.getStocks();
		int value = 0;
		
		for (Stock stock : temp) {
			System.out.println(stock);
			value += stock.getTotal_value_of_shares();
		}
		
		System.out.println(" Your entire portfolio is worth: " + value);

	}

}
