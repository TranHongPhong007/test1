/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author LENOVO
 */


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.DBConnection;
import model.Teacher;

public class TeacherDAO {
    private Connection conn;


        public TeacherDAO() {
        this.conn = DBConnection.getConnection(); // Sử dụng DBConnection để lấy kết nối
        if (this.conn == null) {
            System.out.println("❌ Lỗi: Không thể kết nối database trong LibraryDAO!");
        } else {
            System.out.println("✅ LibraryDAO đã kết nối database thành công!");
        }
    }

    public List<Teacher> getAll() {
        List<Teacher> teachers = new ArrayList<>();
        String sql = "SELECT * FROM YourID";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                teachers.add(new Teacher(
                        rs.getString("TeacherID"),
                        rs.getString("Name"),
                        rs.getString("DOB"),
                        rs.getString("Tel")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teachers;
    }
    
        public static void main(String[] args) {
        TeacherDAO dao = new TeacherDAO();
        List<Teacher> teachers = dao.getAll();

        if (teachers.isEmpty()) {
            System.out.println("Không có sách nào trong database.");
        } else {
            for (Teacher t : teachers) {
                System.out.println("ID: " + t.getTeacherID() + " | Name: " + t.getName()
                        + " | Day of birth: " + t.getDob() + " | Phone numbers: " + t.getTel());
            }
        }

    }
}
