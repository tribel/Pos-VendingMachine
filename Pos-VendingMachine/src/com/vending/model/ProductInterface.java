package com.vending.model;

import java.util.List;

public interface ProductInterface {

	String getName();
	
	void setName(String name);
	
	int getPrice();
	
	void setPrice(int price);
	
	List<String> getIngredients();
	
	void setIngredients(String... ingridients);
}
