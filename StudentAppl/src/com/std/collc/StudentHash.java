package com.std.collc;

import com.std.model.StudentData;
import com.std.model.StudentId;

import java.util.HashMap;
import java.util.Map;

public class StudentHash {

    private Map<StudentId, StudentData> studentMap;

    //@Override
    public void initializeHash() {
        studentMap = new HashMap<>();
    }

    //@Override
    public void insertStudentRec(StudentId studentId, StudentData student) {
        studentMap.put(studentId, student);
    }

    public StudentHash() {
        System.out.println("Default constructor");
    }

    public StudentHash(Map<StudentId, StudentData> studentMap) {
        this.studentMap = studentMap;
    }
}
