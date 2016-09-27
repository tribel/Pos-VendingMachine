package com.vending.model;

public class Juice extends Product{

	protected JuiceType type;
	
	public Juice(String name, int price, String... ingridients) {
		super(name, price, ingridients); 
	}
	
	public Juice(String name, int price, JuiceType type, String... ingridients) {
		super(name, price, ingridients);
		this.type = type;
		JuiceType.values();
	}

	
	enum JuiceType {
		
		APPLE, ORANGE;
	}
	
}
