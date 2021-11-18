package com.stocks.entities;

import java.util.ArrayList;

//contains the list of stocks owned and the total value they're worth
public class Portfolio {

	private static ArrayList<Stock> stocks = new ArrayList<Stock>();
	
	public static ArrayList<Stock> getStocks() {
		return stocks;
	}

	public static void setStocks(ArrayList<Stock> stocks) {
		Portfolio.stocks = stocks;
	}

}
