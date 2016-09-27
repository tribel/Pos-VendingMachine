package com.vending.model;


public class Tea extends Product {

	protected TeaType type;
	
	public Tea(String name, int price, String... ingridients) {
		super(name, price, ingridients);
	}
	
	public Tea(String name, int price, TeaType type ,String... ingridients) {
		super(name, price, ingridients);
		this.type = type;
	}
	
	
	enum TeaType {
		
		GREEN , BLACK;
	}
	
}
