/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author XM26150
 */
public class testOracle {
    
    
  
    
    
    
    private Connection conexion;

    /**
     * @return the conexion
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * @param conexion the conexion to set
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    /**
     *
     * @return
     */
    public testOracle Conectar()
    {
        try{
        Class.forName("oracle.jdbc.OracleDriver");
        String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
        conexion= DriverManager.getConnection(BaseDeDatos,"SYSTEM","alicia21");
        if(conexion!=null)
        {
        System.out.println("Conexion exitosa a esquema HR");
        }
        else{System.out.println("Conexion fallida");}
        }
        catch(Exception e)
        {e.printStackTrace();}
       
    return this;
    }
      public static void main(String[] args) {
        // TODO code application logic here
  testOracle obconeccion=new testOracle();
    obconeccion.Conectar();
    }
}
