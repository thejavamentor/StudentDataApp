package com.stud.info;

import com.std.model.StudentId;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapUtility {

    public static boolean putElementInList(Map map, float key, StudentId studentId){
        if(map.get(key) != null){
            ((List<StudentId>) map.get(key)).add(studentId);
            return Boolean.FALSE;
        } else {
            List<StudentId> list = List.of(studentId);
            map.put(key, list);
            return Boolean.TRUE;
        }
    }
}
