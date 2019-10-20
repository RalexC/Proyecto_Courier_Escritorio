/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ralex
 */
public class conexion {

    public static Connection patronSinglenton = null;

    public static Connection conexion() {
        try {
            if (patronSinglenton == null) {
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost/BDCOURIER";
                String pwd = "";
                String usr = "root";
                
                Class.forName(driver);
                patronSinglenton = DriverManager.getConnection(url, usr, pwd);                
                System.out.println("Conexion con MYSQL exitosa");
            }
           
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        }
        return patronSinglenton;
//         try{
//            if (conect== null) {
//                String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//                String url    = "jdbc:sqlserver://RALEX-PC\\SQLEXPRESS:1433;databaseName=BDCOURIER4";
//                
//                Class.forName(driver);
//                conect = DriverManager.getConnection(url,"practicandoSQL","123456");
//                System.out.println("Conexion exitosa");
//            }            
//        }catch (ClassNotFoundException | SQLException e){
//            System.out.println("Error al conectar: "+e.getMessage());
//        }
//        return conect;
    }
      
   
    
    public static void main(String[] args) {
        conexion();
    }
    
}    
    

