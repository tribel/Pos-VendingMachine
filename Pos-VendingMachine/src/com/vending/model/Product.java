package com.vending.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Tribel
 *
 */
public abstract class Product implements ProductInterface{

	protected String name;
	protected int price;
	protected List<String> ingridients;
	
	
	public Product(String name, int price, String... ingridients) {
		this.name = name;
		this.price = price;
		this.setIngredients(ingridients);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name += name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void setPrice(int price) {
		if(price < 0) 
			throw new IllegalArgumentException("Negative cost is forbbiden");
		this.price = price;
	}

	@Override
	public List<String> getIngredients() {
		return this.ingridients;
	}

	@Override
	public void setIngredients(String... ingridients) {
		if(this.ingridients == null) 
			this.ingridients = new ArrayList<>();
		
		for(String i: ingridients) {
			this.ingridients.add(i);
		}
	}
	
}
