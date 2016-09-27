package com.vending.model;

public class SalesLineItem {

	private ProductInterface product;
	private int quantity;
	
	public SalesLineItem(ProductInterface product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public ProductInterface getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	
	public int getSubTotal() {
		return quantity * product.getPrice();
	}
	
}
