package model;

import java.sql.Connection;
import java.sql.DriverManager;

   
public class Conexion { 
    public Connection con;  
    String url = "jdbc:mysql://localhost:3306/sistemaescuela";
    String user = "root";
     
    public Connection Conectar(){                              
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con  = DriverManager.getConnection(url,user,"");       
            if(con == null){  
                System.out.println("No hay conexión");   
            } 
        } catch (Exception e) {
            System.out.println("Error: " +e);
        } 
        return con; 
           
    }
    
}
