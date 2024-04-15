package One;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    
    
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/final", "root",  "Password");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
    
    public Connection getconnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/final", "root", "Password");
        }   catch (Exception ex) {
            System.out.println("Error en la conexion" +ex);
        }
        return con;
    }
    
    
   public static Connection getConection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/alma", "root",  "Password");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    } 
    
}   


    
    

