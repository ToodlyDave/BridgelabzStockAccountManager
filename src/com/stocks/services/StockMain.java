package com.stocks.services;

public class StockMain {

	public static void main(String[] args) {
		System.out.println(" Welcome to the stock account manager!");
		
		StockManager objManager = new StockManager();
		objManager.createPortfolio();
		objManager.printPortfolio();
	}
}
