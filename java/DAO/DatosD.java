/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import persistence.Conection;
import bean.DatosBean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XM26150
 */
public class DatosD {
    Conection objConn = new Conection();
    private Connection  conn= null; 
    
    
   public List cosnultaTodos(){
       
       DatosBean datosBean = null;
       List <DatosBean> listDatos = null;
       conn = objConn.getConexion();
       try{
       listDatos = new ArrayList<DatosBean>(); 
    Statement stmt = conn.createStatement();
    ResultSet rset = stmt.executeQuery("select * from AQ$_INTERNET_AGENT_PRIVS");

    while (rset.next()){
         datosBean = new DatosBean();
         datosBean.setNombre(rset.getString(1));
         listDatos.add(datosBean);
         System.out.println(rset.getString(1));
         //System.out.println (rset.getString(1));   // Print col 1
         stmt.close();
    }
       }catch(Exception m){
        
        
    }
 
    
    return listDatos;
    
   }
}
