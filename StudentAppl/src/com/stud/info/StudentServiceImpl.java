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
        if(StringUtility.isNullOrEmpty(studentId)){
            System.out.println("Student id can be null ");
            return;
        }
        String arr[] = StringUtility.splitString(studentId);
        BranchEnum branch = BranchEnum.getBranch(arr[1]);
        StudentId studentIdObj = new StudentId(Integer.parseInt(arr[0]), branch, Integer.parseInt(arr[2]));
        StudentData student1 = new StudentData(studentIdObj,CGPA);
        records.insertStudentRec(studentIdObj,student1);
        System.out.println("Student data inserted : "+ studentId);
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

    // These are the addition method required to retrieve the data
    @Override
    public StudentData getStudentDataById(StudentHash records, String studentId){
        return records.getStudentDataById(studentId);
    }
}
