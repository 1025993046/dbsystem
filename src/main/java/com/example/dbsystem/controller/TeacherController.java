package com.example.dbsystem.controller;

import com.example.dbsystem.domain.Attend;
import com.example.dbsystem.domain.Student_course;
import com.example.dbsystem.domain.Teacher;
import com.example.dbsystem.service.TeacherService;
import com.example.dbsystem.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;


    /**
     * 根据工号获取自己的基本信息
     */
    @RequestMapping("/getmessage")
    @ResponseBody
    public TeacherMsg getmessage(@RequestParam("tno")int tno){
        Teacher teacher=null;
        try {
            teacher= teacherService.getmessage(tno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(teacher!=null){
            Meta meta=new Meta("查询信息成功",200);
            TeacherMsg result=new TeacherMsg(teacher,meta);
            return result;
        }else {
            Meta meta=new Meta("查询失败，信息不存在",201);
            TeacherMsg result=new TeacherMsg(teacher,meta);
            return result;
        }
    }

    /**
     * 改变自己的基本信息
     */
    @RequestMapping("/changemessage")
    @ResponseBody
    public  TeacherMsg changemessage(Teacher teacher){
        int result =0;
        Teacher t=null;
        try {
            result = teacherService.changemessage(teacher);
            t=teacherService.getmessage(teacher.getTno());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
            Meta meta=new Meta("修改信息成功",200);
            TeacherMsg r=new TeacherMsg(teacher,meta);
            return r;
        }else{
            Meta meta=new Meta("修改失败，请检查是否存在错误",201);
            TeacherMsg r=new TeacherMsg(teacher,meta);
            return r;
        }
    }



    /**
     * 录入考勤数据
     */
    @RequestMapping("/addattend")
    @ResponseBody
    public Meta addattend(Attend attend){
        int result=0;
        try {
            result = teacherService.addattend(attend);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
            Meta meta=new Meta("录入信息成功",200);
            return meta;
        }else{
            Meta meta=new Meta("录入失败，发生错误",201);
            return meta;
        }
    }


    /**
     * 修改学生考勤信息
     */
    @RequestMapping("/updateattend")
    @ResponseBody
    public Teacher_StudMsg updateattend(@RequestParam("sno")int sno, Attend attend){
        int result=0;
        Attend a=null;
        try {
            result=teacherService.updateattend(sno,attend);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
            Meta meta=new Meta("修改信息成功",200);
            Teacher_StudMsg r=new Teacher_StudMsg(attend,meta);
            return r;
        }else{
            Meta meta=new Meta("修改失败，发生错误",201);
            Teacher_StudMsg r=new Teacher_StudMsg(null,meta);
            return r;
        }
    }



    /**
     * 按姓名查询学生考勤信息
     */
    @RequestMapping("/findByName")
    @ResponseBody
    public Name_Attend findByName(String name){
        List<Attend> attends =null;
        try {
             attends =teacherService.findByName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(attends.size()>=1){
            Meta meta=new Meta("查询信息成功",200);
            Name_Attend result=new Name_Attend(attends,meta);
            return result;
        }else{
            Meta meta=new Meta("查询失败，请检查是否存在",201);
            Name_Attend result=new Name_Attend(attends,meta);
            return result;
        }
    }


    /**
     * 按时间查询学生考勤信息
     */
    @RequestMapping("/findByTime")
    @ResponseBody
    public Time_Attend findByTime(String time){
        List<Attend> attends =null;
        try {
            attends = teacherService.findByTime(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (attends.size()>=1){
            Meta meta=new Meta("查询信息成功",200);
            Time_Attend result=new Time_Attend(attends,meta);
            return result;
        }else {
            Meta meta=new Meta("查询失败，请检查是否存在",201);
            Time_Attend result=new Time_Attend(attends,meta);
            return result;
        }
    }


    /**
     * 按班级查询学生考勤信息
     */
    @RequestMapping("/findByClassname")
    @ResponseBody
    public Classname_Attend findByClassname(String classname){
        List<Attend> attends = null;
        try {
            attends = teacherService.findByClassname(classname);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(attends.size()>=1){
            Meta meta=new Meta("查询信息成功",200);
            Classname_Attend result=new Classname_Attend(attends,meta);
            return result;
        }else{
            Meta meta=new Meta("查询失败，请检查是否存在",201);
            Classname_Attend result=new Classname_Attend(attends,meta);
            return result;
        }
    }



    /**
     * 统计本学期各学生的考勤状况
     */
    @RequestMapping("/addupattend")
    @ResponseBody
    public Sum_Attend addupattend(){
        List<Attend> attends=null;
        try {
            attends= teacherService.addupattend();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(attends.size()>=1){
            Meta meta=new Meta("查询信息成功",200);
            Sum_Attend result=new Sum_Attend(attends,meta);
            return result;
        }else{
            Meta meta=new Meta("查询失败，请检查是否存在",201);
            Sum_Attend result=new Sum_Attend(attends,meta);
            return result;
        }
    }


    /**
     * 录入教师所授课程
     */
    @RequestMapping("/addTeacherCourse")
    @ResponseBody
    public Meta addTeacherCourse(int tno,String tname,int cno,String cname){
        int result=0;
        try {
            result= teacherService.addTeacherCourse(tno, tname, cno, cname);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=0){
            Meta meta=new Meta("录入课程成功",200);
            return meta;
        }else{
            Meta meta=new Meta("录入失败，请检查是否有错误",201);
            return meta;

        }
    }


    /**
     * 导入学生所选课程的成绩
     */
    @RequestMapping("/insertgrade")
    @ResponseBody
    public Meta insertgrade( int sno,int cno,int grade){
        int result =0;
        try {
            result = teacherService.insertgrade(sno, cno, grade);
        } catch (Exception e) {
            e.printStackTrace();
            Meta meta=new Meta("没有接收到课程号与学号，录入错误",201);
            return meta;
        }
        if (result!=0){
            Meta meta=new Meta("录入课程成功",200);
            return meta;
        }else{
            Meta meta=new Meta("录入失败，请检查是否有错误",201);
            return meta;

        }
    }



    /**
     * 修改学生所学课程的成绩
     */
    @RequestMapping("/updategrade")
    @ResponseBody
    public UpStudent_Grage updategrade(Student_course s){
        int result =0;
        try {
            result=teacherService.updategrade(s.getSno(), s.getCno(), s.getGrade());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
            Meta meta=new Meta("修改成绩成功",200);
            UpStudent_Grage r=new UpStudent_Grage(s,meta);
            return r;
        }else{
            Meta meta=new Meta("修改失败，请检查是否有错误",201);
            UpStudent_Grage r=new UpStudent_Grage(null,meta);
            return r;
        }
    }



    /**
     * 删除学生所学课程的成绩
     */
    @RequestMapping("/deletegrade")
    @ResponseBody
    public Meta deletegrade(int sno,int cno){
        int result =0;
        try {
            result=teacherService.deletegrade(sno,cno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=0){
            Meta meta=new Meta("删除成功",200);
            return meta;
        }else{
            Meta meta=new Meta("删除失败，请检查是否有错误",201);
            return meta;
        }
    }


    /**
     * 查询指定学生的指定课程的成绩
     */
    @RequestMapping("/selectgrade")
    @ResponseBody
    public Student_OneGrade selectgrade(int sno, int cno){
        Student_course student_course =null;
        try {
            student_course = teacherService.selectgrade(sno, cno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (student_course!=null){
            Meta meta=new Meta("查询成功",200);
            Student_OneGrade result=new Student_OneGrade(student_course,meta);
            return result;
        }else{
            Meta meta=new Meta("查询失败，目标课程不存在",201);
            Student_OneGrade result=new Student_OneGrade(student_course,meta);
            return result;
        }
    }


    /**
     * 统计信息
     */
    @RequestMapping("/findattendnum")
    @ResponseBody
    public Sum_Msg findattendnum(String attend){
        int sum=0;
        try {
            sum =teacherService.findattendnum(attend);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (sum!=0){
            Meta meta=new Meta("统计数量成功",200);
            Sum_Msg result=new Sum_Msg(sum,meta);
            return result;
        }else{
            Meta meta=new Meta("统计失败，数据错误",201);
            Sum_Msg result=new Sum_Msg(sum,meta);
            return result;
        }
    }

    /**
     * 统计考勤信息的数据
     */
    @RequestMapping("/attendData")
    @ResponseBody
    public AttendData attendData(){

        try {
            int chuqin=teacherService.findattendnum("出勤");
            int chidao=teacherService.findattendnum("迟到");
            int zaotui=teacherService.findattendnum("早退");
            int kuangke=teacherService.findattendnum("旷课");
            int qingjia=teacherService.findattendnum("请假");
            AttendData data=new AttendData(chuqin,chidao,zaotui,kuangke,qingjia);
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AttendData();
    }
}
