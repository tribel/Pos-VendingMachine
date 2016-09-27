package com.vending.services;

import java.util.List;
import java.util.Map;

import com.vending.model.Coin;
import com.vending.model.ProductInterface;
import com.vending.model.Sale;
import com.vending.model.SalesLineItem;
import com.vending.model.Store;

public class StorePos implements Pos{

	private Sale currentSale;
	private Store store;
	
	public StorePos(Store store) {
		this.store = store;
		currentSale = new Sale();
	}
	
	@Override
	public Map<String, ProductInterface> getStock() {
		return null;
	}

	@Override
	public List<SalesLineItem> getOrderedProducts() {
		return currentSale.getOrderedProducts();
	}

	@Override
	public void newSale() {
		currentSale = new Sale();
	}

	@Override
	public void makePayment() {
		currentSale.doPayment();
	}

	@Override
	public int getTotalCost() {
		return currentSale.calculateTotalCost();
	}

	@Override
	public int getTotalInput() {
		return currentSale.getTotalCoinsVal();
	}

	@Override
	public boolean addOrder(String drink, int quantity) {
		ProductInterface product = store.getProduct(drink);
		if(product == null) {
			return false;
		}
		
		currentSale.addLineItems(product, quantity);
		return true;
	}

	@Override
	public void addCoin(List<Coin> coins) {
		currentSale.addCoin(coins);
	}

	@Override
	public List<Coin> getChange() {
		return currentSale.getChange();
	}

}
