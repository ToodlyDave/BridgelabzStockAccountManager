package com.stocks.entities;

import java.util.ArrayList;

public class Portfolio {

	private static ArrayList<Stock> stocks = new ArrayList<Stock>();
	
	private static double total_value;

	public static ArrayList<Stock> getStocks() {
		return stocks;
	}

	public static void setStocks(ArrayList<Stock> stocks) {
		Portfolio.stocks = stocks;
	}

	public static double getTotal_value() {
		return total_value;
	}

	public static void setTotal_value(double total_value) {
		Portfolio.total_value = total_value;
	}
	
	
}
