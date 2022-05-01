package com.example.dbsystem.service;

import com.example.dbsystem.domain.Course;
import com.example.dbsystem.domain.Dba;
import com.example.dbsystem.domain.Student;
import com.example.dbsystem.domain.Teacher;

import java.util.List;

public interface DbaService {
    /**
     * 录入课程信息
     * @param course
     * @throws Exception
     * @return
     */
    int insertCourse(Course course) throws Exception;


    /**
     * 查询指定课程信息
     * @param cno 课程号，下同
     * @return
     * @throws Exception
     */
    Course selectCourse(int cno) throws Exception;

    /**
     * 修改课程信息
     * @param cno
     * @param course
     * @throws Exception
     * @return
     */
    int updateCourse(int cno , Course course) throws Exception;


    /**
     * 删除课程信息
     * @param cno
     * @throws Exception
     * @return
     */
    int deleteCourse(int cno) throws Exception;

    /**
     * 查询所有课程信息
     * @return
     * @throws Exception
     */
    List<Course> findAllCourse() throws Exception;



    /**
     * 录入学生信息
     * @param student
     * @throws Exception
     * @return
     */
    int insertStudent(Student student) throws Exception;



    /**
     * 查询指定学生信息
     * @param sno  学生的学号，下同
     * @return
     * @throws Exception
     */
    Student selectStudent(int sno) throws Exception;



    /**
     * 修改学生信息
     * @param sno
     * @param student
     * @throws Exception
     * @return
     */
    int updateStudent(int sno , Student student) throws Exception;



    /**
     * 删除学生信息
     * @param sno
     * @throws Exception
     * @return
     */
    int deleteStudent(int sno) throws Exception;

    /**
     * 查询所有学生信息
     * @return
     * @throws Exception
     */
    List<Student> findAllStudent() throws Exception;


    /**
     * 录入学生与所上课程的信息
     * @param sno
     * @param cno
     * @return
     * @throws Exception
     */
    int insertStudentCourse(int sno,int cno) throws Exception;

    /**
     * 查询指定学生与他所上的课程
     * @param sno
     * @return
     * @throws Exception
     */
    List<Course> selectStudentCourse(int sno)throws Exception;

    /**
     * 修改学生与所上课程的信息
     * @param sno
     * @param oldcno
     * @param newcno
     * @return
     * @throws Exception
     */
    int updateStudentCourse(int sno, int oldcno,int newcno)throws Exception;

    /**
     * 删除学生与所上课程的信息
     * @param sno
     * @param cno
     * @return
     * @throws Exception
     */
    int deleteStudentCourse(int sno,int cno)throws Exception;



    /**
     * 录入教师信息
     * @param teacher
     * @throws Exception
     * @return
     */
    int insertTeacher(Teacher teacher) throws Exception;


    /**
     * 查询指定教师信息
     * @param tno 教师的工号，下同
     * @return
     * @throws Exception
     */
    Teacher selectTeacher(int tno) throws Exception;


    /**
     * 修改教师信息
     * @param tno
     * @param teacher
     * @throws Exception
     * @return
     */
    int updateTeacher(int tno , Teacher teacher) throws Exception;


    /**
     * 删除教师信息
     * @param tno
     * @throws Exception
     * @return
     */
    int deleteTeacher(int tno) throws Exception;


    /**
     * 查询所有教师信息
     * @return
     * @throws Exception
     */
    List<Teacher> findAllTeacher() throws Exception;


    /**
     * 录入教师与所上课程的信息
     * @param tno
     * @param cno
     * @return
     * @throws Exception
     */
    int insertTeacherCourse(int tno,int cno) throws Exception;

    /**
     * 查询指定教师与他所上的课程
     * @param tno
     * @return
     * @throws Exception
     */
    List<Course> selectTeacherCourse(int tno)throws Exception;

    /**
     * 修改教师与所上课程的信息
     * @param tno
     * @param oldcno
     * @param newcno
     * @return
     * @throws Exception
     */
    int updateTeacherCourse(int tno, int oldcno,int newcno)throws Exception;

    /**
     * 删除教师与所上课程的信息
     * @param tno
     * @param cno
     * @return
     * @throws Exception
     */
    int deleteTeacherCourse(int tno,int cno)throws Exception;


    Dba selectDba(int no, String password)throws Exception;

    Teacher loginTeacher(int no,String password)throws Exception;

    Student loginStudent(int no, String password)throws Exception;
}
