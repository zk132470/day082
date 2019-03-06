package com.qf.action;

import com.qf.domain.Student;
import com.qf.serviceimpl.StudentServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import java.util.Map;

@Controller
public class StudentAction {

    @Autowired
    private StudentServiceimpl studentServiceimpl;

    @RequestMapping("/getAllStudent")
    public String getAllStudents(Map<String,Object> map){
        List<Student> allStudent = studentServiceimpl.getAllStudent();
        map.put("allStudent",allStudent);

        return "/index.jsp";
    }

    @RequestMapping("addAStudent")
    public String addAStudent(Student student){
        studentServiceimpl.addAStudent(student);
        return "/index.jsp";
    }

    @RequestMapping(value = "removeAStudentBySid/{sid}",method = RequestMethod.DELETE)
    public String removeAStudentBySid(@PathVariable("sid") String sid){
        System.out.println(sid);

        studentServiceimpl.removeAStudentBySid(sid);
        return "/index.jsp";
    }

}
