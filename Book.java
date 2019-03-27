package org.techquiero.FinalJAVA;

public class Book {
	private String name;
	private String author;
	public double price;
	
	public Book() {
		
	}
	
	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}


	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getAuthor() {
		return author;
	}
	private void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	private void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + ".  " + author + ".  $" + price;
	}
	
	
}
