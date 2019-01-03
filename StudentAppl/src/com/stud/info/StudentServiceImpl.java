package com.stud.info;

import com.std.collc.StudentHash;
import com.std.model.BranchEnum;
import com.std.model.StudentData;
import com.std.model.StudentId;

public class StudentServiceImpl implements  StudentService {

    //This function creates an empty hash table and points to null.
    @Override
    public void initializeHash(StudentHash records) {
        records.initializeHash();
    }

    @Override
    public void insertStudentRec(StudentHash records, String studentId, float CGPA) {
        String arr[] = StringUtility.splitString(studentId);
        BranchEnum branch = BranchEnum.getBranch(arr[0]);
        StudentId studentId1 = new StudentId(Integer.parseInt(arr[0]), branch, Integer.parseInt(arr[2]));
        StudentData student1 = new StudentData(studentId1,CGPA);
        records.insertStudentRec(studentId1,student1);
    }

    @Override
    public void hallOfFame(StudentHash records, float CGPA) {

    }

    @Override
    public void newCourseList(StudentHash records, float CGPAFrom, float CPGATo) {

    }

    @Override
    public void depAvg(StudentHash records) {

    }

    @Override
    public void destroyHash(StudentHash records) {

    }
}
