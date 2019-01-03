package com.std.model;

public class StudentData {
    private StudentId studentId;
    private float cgpa;

    public StudentData(StudentId studentId) {
        this.studentId = studentId;
    }

    public StudentData(StudentId studentId, float cgpa) {
        this.studentId = studentId;
        cgpa = cgpa;
    }

    public StudentId getStudentId() {
        return studentId;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "studentId=" + studentId +
                ", cgpa='" + cgpa + '\'' +
                '}';
    }
}
