package pro.elegy.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.elegy.demo.entity.Student;
import pro.elegy.demo.entity.TestStudent;

@RestController
public class IndexController {
    @Autowired
    private static Student student;
    @Autowired
    private static TestStudent teststudent;


    public static void main(String[] args) {
        System.out.println(teststudent.getName()+"，"+teststudent.getAge());
    }
}
