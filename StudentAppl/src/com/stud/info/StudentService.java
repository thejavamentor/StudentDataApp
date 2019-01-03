package com.stud.info;

import com.std.collc.StudentHash;

public interface StudentService {
    void initializeHash(StudentHash records);
    void insertStudentRec(StudentHash records, String studentId, float CGPA);
    void hallOfFame(StudentHash records, float CGPA);
    void newCourseList(StudentHash records, float CGPAFrom, float CPGATo);
    void depAvg(StudentHash records);
    void destroyHash(StudentHash records);
}
