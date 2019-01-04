package com.stud.info;

import com.std.model.BranchEnum;
import com.std.model.StudentId;

public class StringUtility {

    public static final String EMPTY_STRING = "";

    public static boolean isNullOrEmpty(String studentId){
        return studentId == null || studentId.length() == 0;
    }

    public static String[] splitString(String studentId){
        String arr[] = new String[3];
        if(isNullOrEmpty(studentId)){
            throw new NullPointerException();
        }
        arr[0]= studentId.substring(0,4);
        arr[1]= studentId.substring(4,7);
        arr[2]= studentId.substring(7);
        return arr;
    }

    public static StudentId getStudentIdObjectFrom(String studentId){
        StudentId studentId1 = null;
        if(isNullOrEmpty(studentId)){
            throw new NullPointerException();
        }
        String arr[] = splitString(studentId);
        BranchEnum branch = BranchEnum.getBranch(arr[1]);
        studentId1 = new StudentId(Integer.parseInt(arr[0]), branch, Integer.parseInt(arr[2]));
        return studentId1;
    }

    public static String getActualStudentIdFrom(StudentId studentIdObj){
        String studentId1 = null;
        if(studentIdObj == null ){
            throw new NullPointerException();
        }
        studentId1 = EMPTY_STRING + studentIdObj.getYear() + studentIdObj.getBranch().getBranchName() + studentIdObj.getRollno();
        return studentId1;
    }
}
