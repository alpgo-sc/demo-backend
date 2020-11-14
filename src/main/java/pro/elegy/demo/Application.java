package pro.elegy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import pro.elegy.demo.controller.StudentController;
import pro.elegy.demo.entity.Student;

@SpringBootApplication
//@EnableConfigurationProperties({Student.class, TestStudent.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentController.class,args);
	}

}
