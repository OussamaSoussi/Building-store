package modeles;

import java.util.*;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private double price;
	private Date releaseDate;
	
//	private static Vector<Book> books = new Vector<Book>();
	
	public Book(int bookId, String title, String author, double price, Date releaseDate ) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		this.releaseDate = releaseDate;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", releaseDate=" + releaseDate + "]";
	}


	public void addBook(Book[] produits,Book p,int nbProduit )
	{
	if (nbProduit<produits.length)
	{produits[nbProduit]=p;
	nbProduit+=1;
	}
	else
	System.out.println("le tableau est plein");
	}
	
	public void deleteBook(Book[] produits,int x)
	{
	produits[x]=null;
	}
	
	public void displayBook (Book[] produits,int nbProduit )
	{
		for (int i=0;i< nbProduit;i++)
		{
			System.out.println("L'article n"+i+" son Nom est"+produits[i].title+" son Prix est"+produits[i].price);
        }
	}
	
	public double displayCalculTotal(double Quantity,Book p) {
		double s ;
		s=Quantity*p.getPrice();
		return s;
	}
}
