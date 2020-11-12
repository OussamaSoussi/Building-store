package modeles;

import java.sql.*;

import connection.MyConnection;

public class Calcul {
	
	
	public void displayCalculTotal(double  quantite,int id) throws ClassNotFoundException, SQLException
    {    MyConnection c;
    PreparedStatement pstmt;
    c = new MyConnection();
	    if (c==null)
            System.out.println("server connection error!");
            else System.out.println("Connected !");
	    
    try {
    	pstmt =  c.Myconnect().prepareStatement("SELECT * FROM Book where id = ? ");
            pstmt.setDouble(1,id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
               
                System.out.println("CalculTotal = "+Double.parseDouble(rs.getString("price"))*quantite);
               
            }}
            catch(SQLException e)
            {e.printStackTrace();}
   
    }
}
