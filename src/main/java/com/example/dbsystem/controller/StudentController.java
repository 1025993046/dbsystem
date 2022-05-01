package com.example.dbsystem.controller;

import com.example.dbsystem.domain.Attend;
import com.example.dbsystem.domain.Student;
import com.example.dbsystem.domain.Student_course;
import com.example.dbsystem.service.StudentService;
import com.example.dbsystem.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.ResponseWrapper;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;


    /**
     * 查看自己课程的成绩
     * @return
     */
    @RequestMapping("/selectgrade")
    @ResponseBody
    public Student_courseMsg selectgrade(int sno){
        List<Student_course> data =null;
        try {
            data = studentService.selectgrade(sno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (data.size()>0){
            Meta meta=new Meta("查询成绩成功",200);
            Student_courseMsg result=new Student_courseMsg( data,meta);
            return result;
        }else{
            Meta meta=new Meta("查询失败，信息不存在",201);
            Student_courseMsg result=new Student_courseMsg(data,meta);
            return result;
        }

    }

    /**
     * 查询考勤信息
     */
    @RequestMapping("/selectattend")
    @ResponseBody
    public Student_attendMsg2 selectattend(@RequestParam("sno")int sno,String pagenum,String pagesize){
        List<Attend> attends=null;
        try {
            attends=studentService.selectattend(sno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(attends.size()>0){
            Meta meta=new Meta("查询考勤成功",200);
            int num=Integer.valueOf(pagenum);
            int size=Integer.valueOf(pagesize);
//            List<Attend> r = new ArrayList<Attend>();
//            for(int i=(num-1)*size;i<=num*size-1;i++){
//                r.add(attends.get(i));
//            }
            int total=attends.size();
            Student_attendMsg2 result=new Student_attendMsg2(attends,meta,num,total);
            return result;
        }else{
            int num=Integer.valueOf(pagenum);
            Meta meta=new Meta("查询失败，信息不存在",201);
            Student_attendMsg2 result=new Student_attendMsg2(null,meta,num,0);
            return result;
        }

    }

    /**
     * 根据学号获取自己的基本信息
     */
    @RequestMapping("/getmessage")
    @ResponseBody
    public StudentMsg getmessage(@RequestParam("sno")int sno){
        Student student=null;
        try {
            student=studentService.getmessage(sno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(student!=null){
            Meta meta=new Meta("查询信息成功",200);
            StudentMsg result=new StudentMsg(student,meta);
            return result;
        }else{
            Meta meta=new Meta("查询失败，信息不存在",201);
            StudentMsg result=new StudentMsg(student,meta);
            return result;
        }

    }


    /**
     * 改变自己的基本信息,通过学号修改其他
     */
    @RequestMapping("/changemessage")
    @ResponseBody
    public StudentMsg changemessage(Student student){
        int result=0;
        Student s=null;
        try {
            result=studentService.changemessage(student);
            student=studentService.getmessage(student.getSno());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
            Meta meta=new Meta("修改信息成功",200);
            StudentMsg a=new StudentMsg(student,meta);
            return a;
        }else{
            Meta meta=new Meta("修改失败，请检查是否有错误",201);
            StudentMsg a=new StudentMsg(student,meta);
            return a;
        }
    }



}
