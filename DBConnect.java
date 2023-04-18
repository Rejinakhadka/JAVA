/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dbconnect;

import java.sql.*;
public class DBConnect {
public static void main(String[] args) {
Connection conn = null;
try {
Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/mydb";
String username = "root";
String password = "password";
conn = DriverManager.getConnection(url, username,
password); System.out.println("Connected to database.");
} catch (ClassNotFoundException e)
{ e.printStackTrace();
} catch (SQLException e) {
e.printStackTrace();
} finally {
if (conn != null) {
try {
conn.close();
System.out.println("Disconnected from database.");
} catch (SQLException e) {
e.printStackTrace();
}
}
}
}
}
