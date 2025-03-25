/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class DBConnection {

    private static final String DB_URL = "jdbc:sqlserver://DESKTOP-6AD99C2;databaseName=PRJ301_YourID;encrypt=false;trustServerCertificate=false;loginTimeout=30";
    private static final String USER = "sa";
    private static final String PASSWORD = "123";

public static Connection getConnection() {
    Connection conn = null;
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        System.out.println("✅ Kết nối database thành công!");
    } catch (ClassNotFoundException e) {
        System.out.println("❌ Lỗi: Không tìm thấy JDBC Driver!");
        e.printStackTrace();
    } catch (SQLException e) {
        System.out.println("❌ Lỗi: Không thể kết nối database! Kiểm tra lại thông tin kết nối.");
        e.printStackTrace();
    }
    return conn;
}
}
