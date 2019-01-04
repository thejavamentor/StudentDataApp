package com.std.model;

import com.stud.info.StringUtility;

public class StudentData {
    private StudentId studentIdObj;
    private String acutalStudentId;
    private float cgpa;

    public StudentData(StudentId studentId) {
        this.studentIdObj = studentId;
        this.acutalStudentId = StringUtility.getActualStudentIdFrom(studentIdObj);
    }

    public StudentData(String studentId2, float cgpa) {
        this.acutalStudentId = studentId2;
        this.studentIdObj = StringUtility.getStudentIdObjectFrom(studentId2);
        this.cgpa = cgpa;
    }

    public StudentData(StudentId studentIdObj, float cgpa) {
        this.studentIdObj = studentIdObj;
        this.acutalStudentId = StringUtility.getActualStudentIdFrom(studentIdObj);
        this.cgpa = cgpa;
    }

    public StudentId getStudentId() {
        return studentIdObj;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public StudentId getStudentIdObj() {
        return studentIdObj;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "studentIdObj=" + studentIdObj +
                ", acutalStudentId='" + acutalStudentId + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
