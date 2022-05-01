package com.example.dbsystem.dao;


import com.example.dbsystem.domain.Attend;
import com.example.dbsystem.domain.Student;
import com.example.dbsystem.domain.Student_course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Mapper
public interface StudentDao {

    /**
     * 查看自己课程的成绩
     * @param sno
     * @return
     * @throws Exception
     */
    @Select("select student_course.sno,student_course.cno,student_course.grade, " +
            "student.name as sname,course.name as cname " +
            "from student_course,student,course " +
            "where student_course.sno=#{sno} " +
            "and student_course.sno=student.sno " +
            "and student_course.cno=course.cno"
              )
    List<Student_course> selectgrade(int sno)throws Exception;


    /**
     * 查询考勤信息
     * @param sno
     * @return
     * @throws Exception
     */
    @Select("select * from attend where sno=#{sno}")
    List<Attend> selectattend(int sno)throws Exception;

    /**
     * 根据工号获取自己的基本信息
     * @return
     * @throws Exception
     */
    @Select("select * from student where sno = #{sno}")
    Student getmessage(int sno)throws Exception;

    /**
     * 改变自己的基本信息
     * @return
     * @throws Exception
     */
    @Update("update student set name=#{name},sex=#{sex},password=#{password},classname=#{classname} where sno = #{sno}")
    int changemessage(Student student)throws Exception;



}
