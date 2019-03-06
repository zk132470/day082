package com.qf.dao;

import com.qf.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapperDao {
    @Select("select * from student")
    public List<Student> selectStudents();
    @Update("insert into student (sid,sname,ssex,sage) values (#{sid},#{sname},#{ssex},#{sage})")
    public void updateAStudent(Student student);
    @Delete("delete from student where sid = #{sid}")
    public void deleteAStudentBySid(String sid);


}
