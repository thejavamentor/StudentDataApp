package com.std.model;

public class StudentData {
    private StudentId studentId;
    private String cgpa;

    public StudentData(StudentId studentId) {
        this.studentId = studentId;
    }

    public StudentId getStudentId() {
        return studentId;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
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
