package practice;

public class Book {

	private String name;
	private String writer;
	private int year;
	
	public Book(String n, String w, int y) {
		name = n;
		writer = w;
		year = y;
	}
	
	public void displayInfo() {
		System.out.println("Title: "+name+", Author: "+writer+", Year: "+year);
		
	}
	
}
