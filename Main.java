package org.techquiero.FinalJAVA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void createFile(String FileName, String text) {
		FileWriter file= null;
		PrintWriter pw = null;
		
		try {
			file = new FileWriter("C:/Users/natal/Files/" + FileName);
			pw = new PrintWriter(file);
			pw.println(text);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void readFile(String Route) {
		File file = null;
		FileReader fr = null;
		BufferedReader bufferedReader = null;
		
		file = new File(Route);
		try {
			fr = new FileReader(file);
			bufferedReader = new BufferedReader(fr);
			
			String line;
			while( (line = bufferedReader.readLine() ) != null) {
				System.out.println(line);				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException  e) {
			e.printStackTrace();
		} finally {
				try {
					if(fr != null) {
						fr.close();
					}
					if(bufferedReader != null) {
						bufferedReader.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Library library = new Library();
		LinkedList<Book> list = library.getList();
		
		
		System.out.printf(
			"¡Bienvenido a TechQuiero Book Store!\n" + 
			"El día de hoy tenemos a la venta: \n\n");
		
		
		
		Iterator<Book> iterator = list.iterator();
		int i = 1;
		while(iterator.hasNext()) {
			System.out.printf("[%d]\t", i);
			Book book = iterator.next();
			System.out.println(book);
			i++;
		}
		
		
		System.out.printf("¿Cuántos libros vas a comprar?");
		int cuant = scan.nextInt();
		double total = 0;
		LinkedList<Book> bought = new LinkedList<Book>();
		
		
		for(int j = 1; j <= cuant; j++){
			System.out.printf("Selecciona la opción del libro que quieres comprar: ");
			int option = scan.nextInt();
			Book e = list.get(option - 1);
			total += e.getPrice();
			bought.add(e);	
		}
		
		createFile("check.txt", "***Ticket de compra***\n");
		try {
			FileWriter flwr = new FileWriter("C:/Users/natal/Files/check.txt", true);
			
			BufferedWriter bfwriter = new BufferedWriter(flwr);
			
			String books = "";
		
			bfwriter.append("***Ticket de compra***");
			bfwriter.newLine();
			for(int j = 0; j < bought.size(); j++) {
				books = bought.get(j) + "";
				bfwriter.append(books);
				bfwriter.newLine();
				
			}
			bfwriter.append("Total: $" + total);
			bfwriter.close();
			flwr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		scan.close();
		ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "C:/Users/natal/Files/check.txt");
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
