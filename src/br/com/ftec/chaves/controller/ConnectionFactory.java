package br.com.ftec.chaves.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static String USERNAME = "root";
    private static String PASSWORD = "";
    private static String DATABASE_URl = 
            "jdbc:mysql://localhost:3306/projetochaves";
    
    public static Connection createConnectionToMySQL() 
            throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URl,
                USERNAME,PASSWORD);      
        return connection;
    }
    
}