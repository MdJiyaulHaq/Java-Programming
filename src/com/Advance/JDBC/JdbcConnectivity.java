package com.Advance.JDBC;
//Java Database Connectivity with php mysql

import java.sql.*;

public class JdbcConnectivity {
    public static void main(String[] args) {
        try {
            // 1. load and register the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url1 = "jdbc:mysql://localhost:3306/myjdbc";

            String sql = "INSERT INTO `students` (`id`, `name`, `roll`) VALUES ('3', 'arjun', '22')";
            String query = "SELECT `id`, `name`, `roll` FROM `students` WHERE 1";

            // 2. connection establish
            Connection connection = DriverManager.getConnection(url1, "root", "");
            if (connection != null) {
                System.out.println("connection successful.");
            }
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()) {

                String namefromsql = resultSet.getString(2);
                System.out.println(namefromsql);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

