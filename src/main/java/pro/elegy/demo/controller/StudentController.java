package pro.elegy.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pro.elegy.demo.entity.Student;
import pro.elegy.demo.service.StudentService;

import java.util.List;


@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> querystudent() {
        return this.studentService.queryStudents();
    }

    @RequestMapping(value = "/querystudent", method = RequestMethod.GET)
    public Student queryStudentBySno(String id) {
        return this.studentService.queryStudentBySno(id);
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public int save(@RequestBody Student student) {
        return this.studentService.add(student);
    }
}
