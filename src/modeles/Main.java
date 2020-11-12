package modeles;

import java.sql.*;
import java.text.*;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
	    
		    User user = new User ();
	        Book book = new Book(null, null, 0, null);
	        
	        int a=0;
	        do {
	        	System.out.println("---Welcome to the store--- ");
	        	System.out.println("what shall you do? ");
	           
	            System.out.println("1: Update book ");
	            System.out.println("2: Add book ");
	            System.out.println("3: Store ");
	            System.out.println("4: Command ");
	            System.out.println("5: delete book ");
	            System.out.println("6: insert user ");	
	            System.out.println("7: check list of users");
	            System.out.println("8: logout ");
	            System.out.println("---------------------------");
	            Scanner s = new Scanner( System.in );
	            a   = s.nextInt();
	            switch(a)
	            {case 1:{
	        System.out.println("Put  the book's id you want to update ");
	        Scanner sc9 = new Scanner( System.in );
	        int idu   = sc9.nextInt();
	        
	         System.out.println(" title ");
	            Scanner sc = new Scanner( System.in );
	            String Title   = sc.nextLine();
	            System.out.println(" author ");
	            Scanner sc1 = new Scanner( System.in );
	            String Author   = sc1.nextLine();
	            System.out.println(" price ");
	            Scanner sc3 = new Scanner( System.in );
	            Double Price   = sc3.nextDouble();
	            
	            System.out.println("enter the release date of the book TO UPDATE (yyyy-mm-dd)");
                Scanner sc4 = new Scanner( System.in );
                String date=sc4.next();
                java.sql.Date Releasedate=java.sql.Date.valueOf(date);
	              book.updateBook(idu, Title,Author, Price, Releasedate);
	          break;
	          }
	            case 2:{ 
	                System.out.println("Put in the book's title ");
	                Scanner sc = new Scanner( System.in );
	                String Title   = sc.nextLine();
	                System.out.println("Put in the book's author ");
	                Scanner sc1 = new Scanner( System.in );
	                String Author   = sc1.nextLine();
	                System.out.println("Put in the book's price ");
	                Scanner sc3 = new Scanner( System.in );
	                Double Price   = sc3.nextDouble();
	                System.out.println("enter the release date of the book TO UPDATE (yyyy-mm-dd)");
	                Scanner sc4 = new Scanner( System.in );
	                String date=sc4.next();
	                java.sql.Date Releasedate=java.sql.Date.valueOf(date);
	                book.insertBooks(Title, Author, Price, Releasedate);
	            
	            break;}
	            case 3:{
	            try {
	                book.displayBook();
	            } catch (ClassNotFoundException | SQLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }break;}
	            case 4:{
	            Calcul ca = new Calcul();
	            System.out.println("Put  the book's id you want to command ");
	            Scanner sc6 = new Scanner( System.in );
	            int id   = sc6.nextInt();
	            System.out.println("Put the Quantity ");
	            Scanner sc7 = new Scanner( System.in );
	            Double quantite  = sc7.nextDouble();
	            ca.displayCalculTotal(quantite,id);break;}
	            case 5:{
	            System.out.println("Put  the book's id you want to delete ");
	            Scanner sc8 = new Scanner( System.in );
	            int idd   = sc8.nextInt();
	            book.deleteBook(idd);
	           break; }
	            case 6:{
	            	user.adduser();
		            	 break;}
	            
			    case 7:{
		         	user.consultuser();
		         	 break;}
	               }
	            }   
	        while(a!=8);
	 }
	 
}
