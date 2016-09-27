package com.vending.model;

public enum Coin {

	ONE(1), FIVE(5), TEN(10), TWENTY_FIVE(25), FIFTY(50);

	private Coin(int val) {
		this.value = val;
	}
	
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public static Coin convertToString(String val) {
		switch (val) {
		case "1":
			return ONE;
		case "5":
			return FIVE;
		case "10":
			return TEN;
		case "25":
			return TWENTY_FIVE;
		case "50":
			return FIFTY;
		default: 
			return null;
		}

	}
}
