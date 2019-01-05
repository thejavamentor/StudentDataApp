package com.stud.info;

import com.std.collc.StudentHash;
import com.std.model.StudentData;

public class Main {

    public static void main(String[] args) {

        System.out.println("This is a student information application ");
        StudentService studentService = new StudentServiceImpl();

        StudentHash studentHashCollc = new StudentHash();

        System.out.println(" This function creates an empty hash table and points to null");
        studentService.initializeHash(studentHashCollc);

        // add student data
        String studentId = "2008CSE1223";
        float cgpaVal= 3.5f;
        studentService.insertStudentRec(studentHashCollc,studentId, cgpaVal);

        // add student data
        studentId = "2008CSE1224 ";
        cgpaVal= 3.9f;
        studentService.insertStudentRec(studentHashCollc,studentId, cgpaVal);
        studentId = "2008CSE1225 ";
        cgpaVal= 4.5f;
        studentService.insertStudentRec(studentHashCollc,studentId, cgpaVal);
        studentId = "2008CSE1226  ";
        cgpaVal= 4.8f;
        studentService.insertStudentRec(studentHashCollc,studentId, cgpaVal);

        // retrieve student data
        StudentData studentData = studentService.getStudentDataById(studentHashCollc,studentId);
        System.out.println(" Student data retrieved : "+ studentData);



    }
}
