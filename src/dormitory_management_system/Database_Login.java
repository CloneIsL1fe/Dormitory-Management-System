/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dormitory_management_system;

import java.sql.*;

/**
 *
 * @author James Patrick
 */
public class Database_Login {
    
    public static Connection mycon(){
        Connection con = null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/dormitory","root","");
                
            }catch(ClassNotFoundException | SQLException e){
                System.out.println(e);
            }
        return con;
    }  
}
