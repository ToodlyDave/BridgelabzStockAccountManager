package com.stocks.entities;

//Contains the stock information - the name, share count, price of shares, total value of stock
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice_of_share() {
		return price_of_share;
	}

	public void setPrice_of_share(double price_of_share) {
		this.price_of_share = price_of_share;
	}

	public int getNo_of_shares() {
		return no_of_shares;
	}

	public void setNo_of_shares(int no_of_shares) {
		this.no_of_shares = no_of_shares;
	}

	public double getTotal_value_of_shares() {
		return total_value_of_shares;
	}

	public void setTotal_value_of_shares(double total_value_of_shares) {
		this.total_value_of_shares = total_value_of_shares;
	}

	@Override
	public String toString() {
		
		System.out.println(" ---- " + name + " ----");
		System.out.println(" Share count: " + no_of_shares);
		System.out.println(" Share price: " + price_of_share);
		System.out.println(" Total value of this stock: " + total_value_of_shares);
		
		return "";
	}
	
}
