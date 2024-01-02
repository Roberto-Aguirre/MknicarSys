/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jhonf
 */
public class ConexMysql {
   Connection conectar = null;

    public Connection establecerConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mknicar","root","user123");
            System.out.println("CONECTADO"); 
            return cn;
            
        }
        catch (Exception e) {
             System.out.println("ERROR DE CONEXION : "+e);
        return null;
        }
    }
    
    
}
