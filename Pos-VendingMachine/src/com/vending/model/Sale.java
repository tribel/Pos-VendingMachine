package com.vending.model;

import java.util.ArrayList;
import java.util.List;

public class Sale {

	private List<SalesLineItem> lineItems;
	private List<Coin> coins;
	
	public Sale() {
		this.lineItems = new ArrayList<>();
		this.coins = new ArrayList<>();
	}
	
	public void addLineItems(ProductInterface product, int quantity) {
		this.lineItems.add(new SalesLineItem(product, quantity));
	}
	
	public void addCoin(Coin coin) {
		this.coins.add(coin);
	}
	
	public void addCoin(List<Coin> coins) {
		this.coins.addAll(coins);
	}
	
	public List<SalesLineItem> getLineItems() {
		return lineItems;
	}
	
	public int getTotalCoinsVal() {
		return coins.stream().mapToInt(x -> x.getValue()).sum();
	}
	
	
	public int calculateTotalCost() {
		return lineItems.stream().mapToInt(x -> x.getSubTotal()).sum();
	}
	
	public void doPayment() {
		if(calculateTotalCost() > getTotalCoinsVal()) 
			throw new RuntimeException();
	
		int wrOff = 0;
		
		while(calculateTotalCost() > wrOff) {
			wrOff += coins.get(0).getValue();
			coins.remove(0);
		}

		Integer[] coinsVal = new Integer[Coin.values().length];
		for(int i = 0; i < coinsVal.length; i++) {
			coinsVal[i] = Coin.values()[i].getValue();
		}
		
		for(int i = (wrOff - calculateTotalCost()); i > 0;) {
			for(Integer cv: coinsVal) {
				if(i >= cv) {
					coins.add(Coin.convertToString(coinsVal.toString()));
					i -= cv;
				}
			}
		}
		 
	}
	
	public List<SalesLineItem> getOrderedProducts() {
		return lineItems;
	}

	public List<Coin> getChange() {
		return coins;
	}
}
