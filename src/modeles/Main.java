package modeles;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book();
		System.out.println("Put in the book's title ");
		Scanner sc = new Scanner( System.in );
		String title   = sc.nextLine();
		System.out.println("Put in the book's author ");
		Scanner sc1 = new Scanner( System.in );
		String author   = sc1.nextLine();
		System.out.println("Put in the book's price ");
		Scanner sc3 = new Scanner( System.in );
		long price   = sc3.nextLong();	
		Date releaseDate = new Date(11-12-1997);
		book.addBook(title, author, price, releaseDate);	
		book.deleteBook(4);
		book.displayBook();
		book.displayCalculTotal(10,1);
	}
}