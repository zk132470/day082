package com.qf.serviceimpl;

import com.qf.dao.StudentMapperDao;
import com.qf.domain.Student;
import com.qf.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceimpl implements StudentService {

    private StudentMapperDao studentMapperDao;
    @Override
    public List<Student> getAllStudent(){
        List<Student> students = studentMapperDao.selectStudents();
        return students;
    }

    @Override
    public void addAStudent(Student student) {
        studentMapperDao.updateAStudent(student);
    }

    @Override
    public void removeAStudentBySid(String sid) {
        studentMapperDao.deleteAStudentBySid(sid);
    }
}
