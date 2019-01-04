package com.std.collc;

import com.std.model.StudentData;
import com.std.model.StudentId;
import com.stud.info.StringUtility;

import java.util.*;

public class StudentHash {

    private Map<StudentId, StudentData> studentMap;

    private CgpaTreeMap cgpaTreeMap;

    //@Override
    public void initializeHash() {
        studentMap = new HashMap<>();
        cgpaTreeMap = new CgpaTreeMap();
    }

    //@Override
    public void insertStudentRec(StudentId studentId, StudentData student) {
        studentMap.put(studentId, student);

        // This is to manage tree map
        cgpaTreeMap.putElement(student.getCgpa(),studentId);

    }

    /*    // Not being used
    public void insertStudentRec(String studentId, StudentData student) {
        StudentId studentIdObj = StringUtility.getStudentIdObjectFrom(studentId);
        studentMap.put(studentIdObj, student);
    }*/

    public StudentData getStudentDataById(String studentId) {
        StudentId studentIdObj = StringUtility.getStudentIdObjectFrom(studentId);
        StudentData student = studentMap.get(studentIdObj);
        return student;
    }

    public List<StudentData> hallOfFame(float cgpaVal) {
        List<StudentData> studentHalfOfFame = new ArrayList<>();
       // cgpaTreeMap.
        return studentHalfOfFame;
    }


    public StudentHash() {
        System.out.println("Default constructor");
    }

    /*    // This is also not being used now
    public StudentHash(Map<StudentId, StudentData> studentMap) {
        this.studentMap = studentMap;
    }*/
}
