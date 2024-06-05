
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConexMysql {

    Connection conectar = null;
    DB db = new DB("localhost", "3306", "mknicar", "root", "Ilike2pizza@");
    String cadenaConexion = "jdbc:mysql://"+db.construirCadena();
    

    public Connection establecerConexion() {
    System.out.println(cadenaConexion);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mknicar", db.getUsuario(), db.getContraseña());
            System.out.println("CONECTADO");
            return cn;

        } catch (Exception e) {
            System.out.println("ERROR DE CONEXION : " + e);
            return null;
        }

    }

}
