package connection;

import java.sql.*;

public class MyConnection {
	 Connection c =null;
	 Statement stmt =null;
	 
	 public MyConnection() throws ClassNotFoundException, SQLException {}
	 
	 public Connection Myconnect() throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.jdbc.Driver");
		 String url = "jdbc:mysql://localhost:3306/bookstore?serverTimezone=UTC";
		 c = DriverManager.getConnection(url,"root","root");
		 return c;
		 }
	 }



