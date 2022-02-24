/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shopping.app.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author THUSH
 */
public class SqlConnection {
       public Connection con;
       
       public SqlConnection() throws SQLException{
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/textile_shop","root","thu$hara#16");
    } 
}
