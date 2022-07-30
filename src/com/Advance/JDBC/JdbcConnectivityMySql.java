package com.Advance.JDBC;
//Java Database Connectivity with php mysql

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnectivityMySql {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            System.out.println("Connection Established");
            Statement statement = connection.createStatement();
            System.out.println("Statement Created");
            ResultSet resultset = statement.executeQuery("select * from student");
            System.out.println("Query Executed. ");
            while (resultset.next()) {
                System.out.println(resultset.getInt(1) + "  " + resultset.getString(2));
            }
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

