package pro.elegy.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.elegy.demo.entity.Student;
import pro.elegy.demo.mapper.StudentMapper;
import pro.elegy.demo.service.StudentService;

import java.util.List;


@Service("studentService")
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return this.studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return this.studentMapper.update(student);
    }


    @Override
    public int deleteBysno(String id) {
        return this.studentMapper.deleteBysno(id);
    }

    @Override
    public Student queryStudentBySno(String id) {
        return this.studentMapper.queryStudentBySno(id);
    }

    @Override
    public List<Student> queryStudents() {
        return this.studentMapper.queryStudents();
    }


}
