package org.techquiero.FinalJAVA;

public class ShoppingCart extends Book{
	private String[] books;
	private double[] prices;
	
	private String[] getBooks() {
		return books;
	}
	private void setBooks(String[] books) {
		this.books = books;
	}
	private double[] getPrices() {
		return prices;
	}
	private void setPrices(double[] prices) {
		this.prices = prices;
	}
	
	
}
