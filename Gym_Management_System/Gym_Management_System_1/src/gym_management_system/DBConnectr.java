/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ccs
 */
public class DBConnectr {
    
     public static Connection connect()
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","123@nidhikushwaha");
           // JOptionPane.showConfirmDialog(null,"connect to data base");
            
        } catch (Exception e) {
            System.out.println("inter.DBConnect.connect()");
            JOptionPane.showMessageDialog(null, e);
        }
       return con;
    }
    
}
