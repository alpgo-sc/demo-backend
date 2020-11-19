package pro.elegy.demo.service;


import pro.elegy.demo.entity.Student;

import java.util.List;

public interface StudentService {
    int add(Student student);

    int update(Student student);

    int deleteBysno(String id);

    Student queryStudentBySno(String id);

    List<Student> queryStudents();
}
