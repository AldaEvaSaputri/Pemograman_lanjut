/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AldaEva
 */
public class InfConnection {
    private Connection InfConnection;
    
    public Connection connect(){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          System.out.println("Berhasil Koneksi");
         }  catch (ClassNotFoundException ex){
             System.out.println("Gagal Koneksi"+ ex);
         }  
      
      String url = "jdbc:mysql://localhost:3306/db_loginform";
      try{
          InfConnection = DriverManager.getConnection(url,"root","");
          System.out.println("Berhasil Koneksi Database");
         }  catch (SQLException ex){
             System.out.println("Gagal Koneksi Database"+ ex);
         }
        return InfConnection;  
}
}
