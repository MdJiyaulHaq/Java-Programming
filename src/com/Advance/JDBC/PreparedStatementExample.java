package com.Advance.JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementExample {
    public static void main(String[] args) throws Exception {
        Class.forName("com.sql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
        PreparedStatement ps = connection.prepareStatement("insert into Student values(?,?,?)");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter roll no:");
            int roll = Integer.parseInt(buffer.readLine());
            System.out.println("Enter name:");
            String name = buffer.readLine();
            System.out.println("Enter Address:");
            String address = buffer.readLine();
            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setString(3, address);
            int result = ps.executeUpdate();
            System.out.println(result + " rows Affected.");

            System.out.println("do you want to insert more data?\n" + "enter y/n");
            String s = buffer.readLine();
            if (s.startsWith("n")) {
                break;
            }
        }
        connection.close();

    }
}
