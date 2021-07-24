package Employeee;

import java.sql.*;
public class conn{
    
    public Connection c;
    public Statement s;
    public PreparedStatement ps;
 
    public conn(){
        try{
        	
        	 String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
        	    String DB_URL = "jdbc:mysql://localhost:3306/bb";
        	    String USER = "root";
        	    String PASS = "insert_password"; 

        	  Connection c = DriverManager.getConnection(DB_URL,USER,PASS);
        	
        	  
        	
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection(DB_URL,USER,PASS);
            s = c.createStatement();
            ps= c.prepareStatement(PASS);
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
