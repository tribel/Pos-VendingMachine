package com.vending.model;

import java.util.HashMap;
import java.util.Map;

public class Store {

	private Map<String, ProductInterface> product;
	
	public Store() {
		product = new HashMap<>();
	}
	
	public void addProduct(ProductInterface pd) {
		if(pd == null) {
			throw new NullPointerException();
		}
		
		product.put(Integer.toString(product.size()), pd);
		
	}	
	
	public ProductInterface getProduct(String name) {
		return product.get(name);
	}
	
	public int getProductNumber() {
		return product.size();
	}
	
	public Map<String, ProductInterface> getProduct() {
		return product;
	}
}
