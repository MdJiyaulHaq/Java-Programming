package com.Advance.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Exam {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Student";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        String query = "SELECT id, name, post, salary FROM Employees WHERE salary>=25000";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String post = resultSet.getString(3);
            float salary = resultSet.getFloat(4);
            System.out.println("name: " + name + " id: " + id + " post " + post + " salary " + salary);
        }
    }
}