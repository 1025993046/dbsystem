package com.example.dbsystem.service;

import com.example.dbsystem.domain.Attend;
import com.example.dbsystem.domain.Student_course;
import com.example.dbsystem.domain.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher getmessage(int tno)throws Exception;

    int changemessage(Teacher teacher)throws Exception;

    int addattend(Attend attend)throws Exception;

    int updateattend(int sno, Attend attend)throws Exception;

    List<Attend> findByName(String name)throws Exception;

    List<Attend> findByTime(String time)throws Exception;

    List<Attend> findByClassname(String classname)throws Exception;

    List<Attend> addupattend()throws Exception;

    int addTeacherCourse(int tno,String tname,int cno,String cname)throws Exception;

    int insertgrade(int sno,int cno,int grade)throws Exception;

    int updategrade(int sno,int cno,int grade)throws Exception;

    int deletegrade(int sno,int cno)throws Exception;

    Student_course selectgrade(int sno, int cno)throws Exception;

    int findattendnum(String attend)throws Exception;

}
