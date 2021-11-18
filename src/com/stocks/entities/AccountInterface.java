package com.stocks.entities;

public interface AccountInterface {
	
	double valueOf();

	void buy(int amount, String symbol);
	
	void sell(int amount, String symbol);
	
	void printReport();
}
