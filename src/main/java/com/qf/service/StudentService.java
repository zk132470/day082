package com.qf.service;

import com.qf.domain.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudent();

    public void addAStudent(Student student);

    public void removeAStudentBySid(String sid);
}
