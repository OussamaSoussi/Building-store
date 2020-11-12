package modeles;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import connection.MyConnection;

public class Command {
	
	    public void addCommand() throws ClassNotFoundException, SQLException { 
	    	double pricebook = 0;
	    
	    MyConnection c;
	    PreparedStatement pstmt;
	    c = new MyConnection();
	    System.out.println("Put in the book's id ");
	    Scanner sc1 = new Scanner( System.in );
	    int idBook   = sc1.nextInt();
	    System.out.println("Put in the quantity ");
	    Scanner sc2 = new Scanner( System.in );
	    int quantity   = sc2.nextInt();
	     try {
	            pstmt = c.Myconnect().prepareStatement("SELECT * FROM Book where id = ? "); 
	            pstmt.setDouble(1,idBook);
	            ResultSet rs = pstmt.executeQuery();
	            while (rs.next()) 
	                {
	                 pricebook =Double.parseDouble(rs.getString("price"));
	                }
	            }
	            catch(SQLException e)
	            {
	                e.printStackTrace();
	            }
	    pstmt =  c.Myconnect().prepareStatement("INSERT INTO `Commande`(id,price,quantity,total,idbook) VALUES ( ?, ?, ?, ?,?)");
	    pstmt.setNString(1, null );
	    pstmt.setInt(5, idBook );
	    pstmt.setDouble(2,pricebook);
	    pstmt.setInt(3, quantity );
	    pstmt.setDouble(4,pricebook*quantity );
	    System.out.println("addition with success");
	    pstmt.executeUpdate();	
	    }
	    public static void totalPrice() throws ClassNotFoundException {
	        double Totalprice=0;
	        try {
	             MyConnection con;
	             PreparedStatement pstmt;
	             con = new MyConnection();
	            pstmt = con.Myconnect().prepareStatement("SELECT total FROM commande ");
	          
	            ResultSet rs = pstmt.executeQuery();
	            while (rs.next())
	                {
	                 Totalprice += Double.parseDouble(rs.getString("total"));
	                }
	            System.out.println();
	            System.out.println("total of orders"+Totalprice);
	            }
	            catch(SQLException e)
	            {
	                e.printStackTrace();
	            }
	      
	      
	    }
	}
	

