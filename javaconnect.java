/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajesh_tuteja
 */

import java.sql.*;
import javax.swing.JOptionPane;
 

public class javaconnect
{
   Connection con = null;   
     
    public static Connection ConnecrDb() {
String url = "jdbc:sqlserver://localhost:1433;databaseName=bank;integratedSecurity=true"; 

 

      try {  
         // Establish the connection.  
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
          Connection con = DriverManager.getConnection(url);  
          return con;
      }

      // Handle any errors that may have occurred.  
      catch (Exception e) {  
          JOptionPane.showMessageDialog(null,e);
      }  
      return null;
    
   }  
    
}
    
   
