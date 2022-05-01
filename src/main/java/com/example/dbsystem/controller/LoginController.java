package com.example.dbsystem.controller;

import com.example.dbsystem.domain.Dba;
import com.example.dbsystem.domain.Student;
import com.example.dbsystem.domain.Teacher;
import com.example.dbsystem.service.DbaService;
import com.example.dbsystem.service.StudentService;
import com.example.dbsystem.service.TeacherService;
import com.example.dbsystem.vo.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    StudentService studentService;

    @Autowired
    DbaService dbaService;

    @Autowired
    TeacherService teacherService;

    @RequestMapping("/login")
    @ResponseBody
    public Meta login(String no, String password, String role){

        Dba dba = null;
        Teacher teacher=null;
        Student student=null;
        if(role.equals("选项1")){
            try {
                dba = dbaService.selectDba(Integer.valueOf(no), password);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (dba!=null){
                return new Meta("登录成功",200);
            }else{
                return new Meta("登录失败，请检查是否有错误",201);
            }

        }else if(role.equals("选项2")){
            try {
                teacher=dbaService.loginTeacher(Integer.valueOf(no),password);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (teacher!=null){
                return new Meta("登录成功",200);
            }else{
                return new Meta("登录失败，请检查是否有错误",201);
            }
        }else{
            try {
                student=dbaService.loginStudent(Integer.valueOf(no),password);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (student!=null){
                return new Meta("登录成功",200);
            }else{
                return new Meta("登录失败，请检查是否有错误",201);
            }
        }
    }
}
