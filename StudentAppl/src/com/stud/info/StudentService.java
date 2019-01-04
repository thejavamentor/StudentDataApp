package com.stud.info;

import com.std.collc.StudentHash;
import com.std.model.StudentData;

public interface StudentService {
    void initializeHash(StudentHash records);
    void insertStudentRec(StudentHash records, String studentId, float CGPA);
    void hallOfFame(StudentHash records, float CGPA);
    void newCourseList(StudentHash records, float CGPAFrom, float CPGATo);
    void depAvg(StudentHash records);
    void destroyHash(StudentHash records);

    // These are the addition method required to retrieve the data
    StudentData getStudentDataById(StudentHash records, String studentId);
}
