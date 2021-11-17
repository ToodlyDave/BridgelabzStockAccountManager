package com.stocks.entities;

public class Stock {

	private String name;
	private int no_of_shares;
	private double price_of_share;
	private double total_value_of_shares;
	
	public Stock(String name, int no_of_shares, double price_of_share) {
		super();
		this.name = name;
		this.no_of_shares = no_of_shares;
		this.price_of_share = price_of_share;
	}

	public double getTotal_value_of_shares() {
		return total_value_of_shares;
	}

	public void setTotal_value_of_shares(double total_value_of_shares) {
		this.total_value_of_shares = total_value_of_shares;
	}

//	@Override
//	public String toString() {
//		
//		System.out.println(" ---- " + name + " ----");
//		System.out.println(" Share count: " + no_of_shares);
//		System.out.println(" Share price: " + price_of_share);
//		System.out.println(" Total value of this stock: " + total_value_of_shares);
//		
//		return "";
//	}
	
	@Override
	public String toString() {
		System.out.println(" Value of " + name + " stock: " + total_value_of_shares);		
		return "";
	}	
}
