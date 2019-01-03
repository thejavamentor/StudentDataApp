package com.stud.info;

public class StringUtility {

    public static String[] splitString(String studentId){
        String arr[] = new String[3];
        if(studentId == null || studentId.length() == 0){
            return arr;
        }
        arr[0]= studentId.substring(0,3);
        arr[1]= studentId.substring(3,6);
        arr[2]= studentId.substring(6);
        return arr;
    }
}
