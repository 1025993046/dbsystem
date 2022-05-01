package com.example.dbsystem.controller;

import com.example.dbsystem.domain.*;
import com.example.dbsystem.service.DbaService;
import com.example.dbsystem.service.TeacherService;
import com.example.dbsystem.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dba")
public class DbaController {
    @Autowired
    DbaService dbaService;

    @Autowired
    TeacherService teacherService;

    /**
     * 录入课程信息
     */
    @RequestMapping("/insertCourse")
    @ResponseBody
    public Meta insertCourse(Course course){
        int result=0;
        try {
            result=dbaService.insertCourse(course);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
           Meta meta=new Meta("录入成功",200);
           return meta;
        }else{
           Meta meta=new Meta("录入失败，出现错误",201);
           return meta;
        }
    }

    /**
     * 查询指定课程信息
     */
    @RequestMapping("/selectCourse")
    @ResponseBody
    public Course_Msg selectCourse(int cno){
        Course course =null;
        try {
            course = dbaService.selectCourse(cno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(course!=null){
            Meta meta=new Meta("查询成功",200);
            Course_Msg result=new Course_Msg(course,meta);
            return result;
        }else {
            Meta meta=new Meta("查询失败，发生错误",201);
            Course_Msg result=new Course_Msg(course,meta);
            return result;
        }
    }

    /**
     * 修改课程信息
     */
    @RequestMapping("/updateCourse")
    @ResponseBody
    public Course_Msg updateCourse(int cno , Course course){
        int result=0;
        try {
            result=dbaService.updateCourse(cno, course);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=0){
            Meta meta=new Meta("修改成功",200);
            Course_Msg r=new Course_Msg(course,meta);
            return r;
        }else {
            Meta meta=new Meta("修改失败，发生错误",201);
            Course_Msg r=new Course_Msg(null,meta);
            return r;
        }
    }


    /**
     * 删除课程信息
     */
    @RequestMapping("/deleteCourse")
    @ResponseBody
    public Meta deleteCourse(int cno) {
        int result=0;
        try {
            result=dbaService.deleteCourse(cno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
            Meta meta=new Meta("修改成功",200);
            return meta;
        }else {
            Meta meta=new Meta("修改失败，发生错误",201);
            return meta;
        }
    }

    /**
     * 查询所有课程信息
     */
    @RequestMapping("/findAllCourse")
    @ResponseBody
    public Courses_Msg2 findAllCourse(String pagenum,String pagesize){
        List<Course> courses =null;
        try {
            courses = dbaService.findAllCourse();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (courses.size()>=1){
            Meta meta=new Meta("查询成功",200);
            int num=Integer.valueOf(pagenum);
            int size=Integer.valueOf(pagesize);
            List<Course> pagecourse = new ArrayList<Course>();
            for(int i=(num-1)*size;i<=num*size-1;i++){
                pagecourse.add(courses.get(i));
            }
            int total=courses.size();
            Courses_Msg2 result=new Courses_Msg2(pagecourse,meta,total);
            return result;
        }else {
            Meta meta=new Meta("查询失败，发生错误",201);
            Courses_Msg2 result=new Courses_Msg2(courses,meta,0);
            return result;
        }
    }

    /**
     * 录入学生信息
     */
    @RequestMapping("/insertStudent")
    @ResponseBody
    public Meta insertStudent(Student student){
        int result=0;
        try {
           result= dbaService.insertStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=0){
            Meta meta=new Meta("录入成功",200);
            return meta;
        }else {
            Meta meta=new Meta("录入失败，发生错误",201);
            return meta;
        }
    }

    /**
     * 查询指定学生信息
     */
    @RequestMapping("/selectStudent")
    @ResponseBody
    public StudentMsg selectStudent(int sno){
        Student student=null;
        try {
            student = dbaService.selectStudent(sno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(student!=null){
            Meta meta=new Meta("查询成功",200);
            StudentMsg result=new StudentMsg(student,meta);
            return result;
        }else {
            Meta meta=new Meta("查询失败，发生错误",201);
            StudentMsg result=new StudentMsg(student,meta);
            return result;
        }
    }

    /**
     * 修改学生信息
     */
    @RequestMapping("/updateStudent")
    @ResponseBody
    public StudentMsg updateStudent(int sno , Student student){
        int result=0;
        try {
            result=dbaService.updateStudent(sno,student);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
            Meta meta=new Meta("修改成功",200);
            StudentMsg r=new StudentMsg(student,meta);
            return r;
        }else{
            Meta meta=new Meta("修改失败，发生错误",201);
            StudentMsg r=new StudentMsg(null,meta);
            return r;
        }
    }

    /**
     * 删除学生信息
     */
    @RequestMapping("/deleteStudent")
    @ResponseBody
    public Meta deleteStudent(int sno){
        int result=0;
        try {

            result=dbaService.deleteStudent(sno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
            Meta meta=new Meta("删除成功",200);
            return meta;
        }else {
            Meta meta=new Meta("删除失败，发生错误",201);
            return meta;
        }
    }

    /**
     * 查询所有学生信息
     * 每页pagesize个，当前第pagenum页
     */
    @RequestMapping("/findAllStudent")
    @ResponseBody
    public Students_Msg2 findAllStudent(String pagenum,String pagesize){
        List<Student> students = null;
        try {
            students = dbaService.findAllStudent();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(students.size()>=1){
            Meta meta=new Meta("查询成功",200);
            int num=Integer.valueOf(pagenum);
            int size=Integer.valueOf(pagesize);
            List<Student> pagestudents = new ArrayList<Student>();
            for(int i=(num-1)*size;i<=num*size-1;i++){
                pagestudents.add(students.get(i));
            }
            int total=students.size();
            Students_Msg2 result=new Students_Msg2(pagestudents,meta,total);
            return result;
        }else {
            Meta meta=new Meta("查询失败，发生错误",201);
            Students_Msg2 result=new Students_Msg2(students,meta,0);
            return result;
        }
    }

    /**
     * 录入学生与所上课程的信息
     */
    @RequestMapping("/insertStudentCourse")
    @ResponseBody
    public Meta insertStudentCourse(int sno,int cno){
        int result=0;
        try {
            result=dbaService.insertStudentCourse(sno,cno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
            Meta meta=new Meta("录入成功",200);
            return meta;
        }else {
            Meta meta=new Meta("录入失败，发生错误",201);
            return meta;
        }
    }


    /**
     * 查询指定学生与他所上的课程
     */
    @RequestMapping("/selectStudentCourse")
    @ResponseBody
    public Courses_Msg selectStudentCourse(int sno){
        List<Course> courses =null;
        try {
            courses = dbaService.selectStudentCourse(sno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (courses.size()>=1){
            Meta meta=new Meta("查询成功",200);
            Courses_Msg result=new Courses_Msg(courses,meta);
            return result;
        }else {
            Meta meta=new Meta("查询失败，发生错误",201);
            Courses_Msg result=new Courses_Msg(courses,meta);
            return result;
        }
    }


    /**
     * 修改学生与所上课程的信息
     */
    @RequestMapping("/updateStudentCourse")
    @ResponseBody
    public Student_course_OneMsg updateStudentCourse(int sno, int oldcno,int newcno){
        int result=0;
        Student_course student_course=null;
        try {
            result=dbaService.updateStudentCourse(sno,oldcno,newcno);
            student_course = teacherService.selectgrade(sno, newcno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
            Meta meta=new Meta("修改成功",200);
            Student_course_OneMsg r=new Student_course_OneMsg(student_course,meta);
            return r;
        }else {
            Meta meta=new Meta("修改失败，发生错误",201);
            Student_course_OneMsg r=new Student_course_OneMsg(null,meta);
            return r;
        }
    }


    /**
     * 删除学生与所上课程的信息
     */
    @RequestMapping("/deleteStudentCourse")
    @ResponseBody
    public Meta deleteStudentCourse(int sno,int cno){
        int result=0;
        try {
            result=dbaService.deleteStudentCourse(sno,cno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=0){
            Meta meta=new Meta("删除成功",200);
            return meta;
        }else {
            Meta meta=new Meta("删除失败，发生错误",201);
            return meta;
        }
    }

    /**
     * 录入教师信息
     */
    @RequestMapping("/insertTeacher")
    @ResponseBody
    public Meta insertTeacher(Teacher teacher){
        int result=0;
        try {
            result=dbaService.insertTeacher(teacher);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=0){
            Meta meta=new Meta("录入成功",200);
            return meta;
        }else {
            Meta meta=new Meta("录入失败，发生错误",201);
            return meta;
        }
    }

    /**
     * 查询指定教师信息
     */
    @RequestMapping("/selectTeacher")
    @ResponseBody
    public TeacherMsg selectTeacher(int tno){
        Teacher teacher = null;
        try {
             teacher = dbaService.selectTeacher(tno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(teacher!=null){
            Meta meta=new Meta("查询成功",200);
            TeacherMsg result=new TeacherMsg(teacher,meta);
            return result;
        }else {
            Meta meta=new Meta("查询失败，发生错误",201);
            TeacherMsg result=new TeacherMsg(teacher,meta);
            return result;
        }
    }

    /**
     * 修改教师信息
     */
    @RequestMapping("/updateTeacher")
    @ResponseBody
    public TeacherMsg updateTeacher(int tno , Teacher teacher){
        int result=0;
        Teacher t=null;
        try {
            result=dbaService.updateTeacher(tno,teacher);
            t=dbaService.selectTeacher(tno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=0){
            Meta meta=new Meta("修改成功",200);
            TeacherMsg r=new TeacherMsg(teacher,meta);
            return r;
        }else {
            Meta meta=new Meta("修改失败，发生错误",201);
            TeacherMsg r=new TeacherMsg(null,meta);
            return r;
        }
    }

    /**
     * 删除教师信息
     */
    @RequestMapping("/deleteTeacher")
    @ResponseBody
    public Meta deleteTeacher(int tno){
        int result=0;
        try {
            result=dbaService.deleteTeacher(tno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(result!=0){
            Meta meta=new Meta("删除成功",200);
            return meta;
        }else {
            Meta meta=new Meta("删除失败，发生错误",201);
            return meta;
        }
    }

    /**
     * 查询所有教师信息
     */
    @RequestMapping("/findAllTeacher")
    @ResponseBody
    public Teachers_Msg findAllTeacher(){
        List<Teacher> teachers =null;
        try {
            teachers = dbaService.findAllTeacher();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (teachers.size()>=1){
            Meta meta=new Meta("查询成功",200);

//            int num=Integer.valueOf(pagenum);
//            int size=Integer.valueOf(pagesize);
//            List<Teacher> pageteacher = new ArrayList<Teacher>();
//            for(int i=(num-1)*size;i<=num*size-1;i++){
//                pageteacher.add(teachers.get(i));
//            }
            int total=teachers.size();
            Teachers_Msg result=new Teachers_Msg(teachers,meta);
            return result;
        }else {
            Meta meta=new Meta("查询失败，发生错误",201);
            Teachers_Msg result=new Teachers_Msg(teachers,meta);
            return result;
        }
    }

    /**
     * 录入教师与所上课程的信息
     */
    @RequestMapping("/insertTeacherCourse")
    @ResponseBody
    public Meta insertTeacherCourse(int tno,int cno){
        int result=0;
        try {
            result=dbaService.insertTeacherCourse(tno, cno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=0){
            Meta meta=new Meta("录入成功",200);
            return meta;
        }else {
            Meta meta=new Meta("录入失败，发生错误",201);
            return meta;
        }
    }

    /**
     * 查询指定教师与他所上的课程
     */
    @RequestMapping("/selectTeacherCourse")
    @ResponseBody
    public Courses_Msg selectTeacherCourse(int tno){
        List<Course> courses = null;
        try {
           courses = dbaService.selectTeacherCourse(tno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (courses.size()>=1){
            Meta meta=new Meta("查询成功",200);
            Courses_Msg result=new Courses_Msg(courses,meta);
            return result;
        }else {
            Meta meta=new Meta("查询失败，发生错误",201);
            Courses_Msg result=new Courses_Msg(courses,meta);
            return result;
        }
    }

    /**
     * 修改教师与所上课程的信息
     */
    @RequestMapping("/updateTeacherCourse")
    @ResponseBody
    public Teacher_course_Meg updateTeacherCourse(int tno, int oldcno,int newcno){
        int result=0;
        Teacher_course teacher_course=new Teacher_course(tno,newcno);
        try {
            result=dbaService.updateTeacherCourse(tno, oldcno, newcno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=0){
            Meta meta=new Meta("修改成功",200);
            Teacher_course_Meg r=new Teacher_course_Meg(teacher_course,meta);
            return r;
        }else {
            Meta meta=new Meta("修改失败，发生错误",201);
            Teacher_course_Meg r=new Teacher_course_Meg(null,meta);
            return r;
        }
    }

    /**
     * 删除教师与所上课程的信息
     */
    @RequestMapping("/deleteTeacherCourse")
    @ResponseBody
    public Meta deleteTeacherCourse(int tno,int cno){
        int result=0;
        try {
            result=dbaService.deleteTeacherCourse(tno, cno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=0){
            Meta meta=new Meta("删除成功",200);
            return meta;
        }else {
            Meta meta=new Meta("删除失败，发生错误",201);
            return meta;
        }
    }
}
