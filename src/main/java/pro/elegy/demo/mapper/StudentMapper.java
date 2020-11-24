package pro.elegy.demo.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import pro.elegy.demo.entity.Student;

import java.util.List;


@Component
@Mapper
public interface StudentMapper {

    @Insert("insert into student(id,name,sex,age,phone,email) values(#{id},#{name},#{sex},#{age},#{phone},#{email})")
    int add(Student student);

    @Update("update student set name=#{name},sex=#{sex} where id=#{id}")
    int update(Student student);

    @Delete("delete from student where id=#{id}")
    int deleteBysno(String id);

    @Select("select * from student where id=#{id}")
    @Results(id = "student", value = {
            @Result(property = "id", column = "id", javaType = String.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "sex", column = "sex", javaType = String.class),
            @Result(property = "age", column = "age", javaType = int.class),
            @Result(property = "phone", column = "phone", javaType = int.class),
            @Result(property = "email", column = "email", javaType = String.class)
    })
    Student queryStudentBySno(String id);


    @Select("select * from student ")
    @Results(id = "students", value = {
            @Result(property = "id", column = "id", javaType = String.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "sex", column = "sex", javaType = String.class),
            @Result(property = "age", column = "age", javaType = int.class),
            @Result(property = "phone", column = "phone", javaType = int.class),
            @Result(property = "email", column = "email", javaType = String.class)
    })
    List<Student> queryStudents();
}
