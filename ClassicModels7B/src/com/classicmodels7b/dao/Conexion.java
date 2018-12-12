/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @israel ramos
 */
public class Conexion {
    Connection con = null;
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String server = "jdbc:mysql://localhost:3306/classicmodels";
            String userName = "root";
            String password = "";
            
            con = (Connection) DriverManager.getConnection(server,userName,password);
        } catch (ClassNotFoundException e) {
            System.out.println("Error driver " + e.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error de conexion " + ex.getMessage());
        } catch (InstantiationException ex) {
            System.out.println("Error " + ex.getMessage());
        } catch (IllegalAccessException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        return con;
        
    }
}

