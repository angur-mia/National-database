/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.DriverManager;

/**
 *
 * @author hp
 */
public class Connection {
  
    
    public void con(){
    
        try {
             java.sql.Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","apcl123456");
    
        } catch (Exception e) {
        }
        
    }
}
