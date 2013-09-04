/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;
import java.sql.*;
/**
 *
 * @author XM26150
 */
public class Conection {
 private Connection conn=null;
 private final String user = "SYSTEM";
 private final String pass = "alicia21";
 private final String portNumber = "1521:XE";
 private final String url = "jdbc:oracle:thin:@localhost:";
  
  
  public Connection getConexion(){
          try{
              
        //Class.forName("oracle.jdbc.OracleDriver");
        //String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:PRUEBA";
      //  System.out.println("conectado a bd 1");
    DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
    // conn = DriverManager.getConnection("jdbc:oracle:thin:@WIN01:1521:oracleBD", "SYSTEM", "alicia21");
     conn = DriverManager.getConnection(url+portNumber, user, pass);
         // driver@machineName:port:SID           ,  userid,  
    System.out.println("conectado a BD "+portNumber);
    return conn;
}catch(Exception m){
     System.out.println("Error en la conexion: "+m.toString());
     return conn;

}
  }
  
  public void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
            conn = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

