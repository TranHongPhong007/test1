/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author LENOVO
 */


public class Teacher {
    private String teacherID;
    private String name;
    private String dob;
    private String tel;

    public Teacher() {}

    public Teacher(String teacherID, String name, String dob, String tel) {
        this.teacherID = teacherID;
        this.name = name;
        this.dob = dob;
        this.tel = tel;
    }

    public String getTeacherID() { return teacherID; }
    public void setTeacherID(String teacherID) { this.teacherID = teacherID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getTel() { return tel; }
    public void setTel(String tel) { this.tel = tel; }

    @Override
    public String toString() {
        return "Teacher{" + "teacherID=" + teacherID + ", name=" + name + ", dob=" + dob + ", tel=" + tel + '}';
    }
    
}

