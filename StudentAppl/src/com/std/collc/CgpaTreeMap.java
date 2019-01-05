package com.std.collc;

import com.std.model.StudentId;
import com.stud.info.MapUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CgpaTreeMap {

    private Map<Float, List<StudentId>> cgpaStudentIdObjListMap;

    public void initializeHash() {
        cgpaStudentIdObjListMap = new TreeMap<>();
    }

    public boolean putElement(float cgpa, StudentId studentId){
        return MapUtility.putElementInList(cgpaStudentIdObjListMap, cgpa, studentId);
    }

    public List<StudentId> getHallOfFame(float cgpa){
        List<StudentId> studentIds = new ArrayList<>();
        //cgpaStudentIdObjListMap.
        return studentIds;
    }

}
