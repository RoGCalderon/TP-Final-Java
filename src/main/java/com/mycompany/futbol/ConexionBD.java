package com.mycompany.futbol;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {         
    
    public Connection Conexion(){ 
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/equiposFutbol","root","root");
            
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
       
    }

    
}
      
