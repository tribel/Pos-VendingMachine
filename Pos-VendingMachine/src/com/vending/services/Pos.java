package com.vending.services;

import java.util.List;
import java.util.Map;

import com.vending.model.Coin;
import com.vending.model.ProductInterface;
import com.vending.model.SalesLineItem;

public interface Pos {

	Map<String, ProductInterface> getStock();
	
	List<SalesLineItem> getOrderedProducts();
	
	void newSale();
	
	void makePayment();
	
	int getTotalCost();
	
	int getTotalInput();
	
	boolean addOrder(String drink, int quantity);
	
	void addCoin(List<Coin> coins);
	
	List<Coin> getChange();
}
