package com.std.model;

import java.util.Objects;

public class StudentId {

    int year;
    Branch branch;
    int rollno;

    public StudentId(int year, Branch branch, int rollno) {
        this.year = year;
        this.branch = branch;
        this.rollno = rollno;
    }

    public int getYear() {
        return year;
    }

    public Branch getBranch() {
        return branch;
    }

    public int getBranchCode() {
        return branch.getBranchCode();
    }

    public String getBranchName() {
        return branch.getBranchName();
    }

    public int getRollno() {
        return rollno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentId)) return false;
        StudentId studentId = (StudentId) o;
        return getYear() == studentId.getYear() && getBranchCode() == studentId.getBranchCode() &&
                getRollno() == studentId.getRollno();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYear(), getBranchCode(), getRollno());
    }
}
