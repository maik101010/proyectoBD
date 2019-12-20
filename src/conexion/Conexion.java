package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author megarcia
 */
public class Conexion {

    private final String db = "db_test";
    private final String url = "jdbc:mysql://localhost/" + db;
    private final String user = "root";
    private final String pass = "";

    public Connection obtenerConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error " + ex);
        }
        return conexion;
    }
    
//    public static void main(String[] args) {
//        Conexion miInstancia = new Conexion();
//        if(miInstancia.obtenerConexion()!=null){
//            System.out.println("Conexion establecida");
//        }else{
//            System.out.println("Ocurrio un error");
//        }
//    }
    
}
