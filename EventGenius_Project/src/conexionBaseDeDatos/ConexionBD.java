/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionBaseDeDatos;

/**
 *
 * @author Oliver
 */
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author miguelcatalan
 */
public class ConexionBD {
    
    private String url = "jdbc:postgresql://proyecto-01-programacion-01.postgres.database.azure.com:5432/postgres";
    private Properties properties = new Properties();
    private static Connection conn = null;
    
    private ConexionBD () {
        properties.setProperty("user", "olijoel0411");
        properties.setProperty("password", "Guatemala2020.");
        
        try {
            conn = DriverManager.getConnection(url, properties);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection() {
        if (conn == null) {
               ConexionBD c = new ConexionBD();
               return c.conn;
        }
        else {
            return conn ;
        }
    }
    public static void main(String[] args) {
      Connection conn = ConexionBD.getConnection();
    }

}
