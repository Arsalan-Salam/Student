/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author arsal
 */
public class StudentList {
    public static void main(String[] args) {
       // Student s1 = new Student("s1", "Arsalan");
        Student[] studentList = new Student[3];
        studentList[0] = new Student("s1", "Arsalan");
        studentList[1] = new Student("s2", "abc");
        studentList[2] = new Student("s3", "xyz");
        
        for(int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getStudentId());
        }
    }
}
