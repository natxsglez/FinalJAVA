package org.techquiero.FinalJAVA;

import java.util.LinkedList;

public class Library{
	private LinkedList<Book> list;
	
	public Library(){
		list = new LinkedList<Book>();
		for(int i=0; i<books.length; i++) {
			Book e = new Book(books[i],authors[i],prices[i]);
			list.add(e);
		}
		
	}
	private String[] books = 
		{
		"Microservicios",
		"Patrones de diseño",
		"Programación Orientada a Objetos",
		"Aprendiendo Java",
		"Aprendiendo Python",
		"Big Data con Hadoop",
		"IOS con Swift",
		"Programación reactiva",
		"Programación con C",
		"Diseño de sistemas"
		};
	private String[] authors = 
		{
		"Christian Posta",
		"Markus Eisele",
		"Richard Warbuton",
		"Ben Evans",
		"David Mertz",
		"Donald Miner",
		"Tim Nugent",
		"Konrad Malawski",
		"Joel Falcou",
		"Doug Davis"
		};
	public double[] prices = 
		{
		(double) 45.98,
		(double) 72.80,
		(double) 36.72,
		(double) 66.81,
		(double) 43.27,
		(double) 39.60,
		(double) 24.18,
		(double) 58.70,
		(double) 67.93,
		(double) 55.67
		};

	public LinkedList<Book> getList() {
		return list;
	}
	
	
}
