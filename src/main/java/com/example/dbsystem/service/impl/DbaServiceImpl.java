package com.example.dbsystem.service.impl;

import com.example.dbsystem.dao.DbaDao;
import com.example.dbsystem.domain.Course;
import com.example.dbsystem.domain.Dba;
import com.example.dbsystem.domain.Student;
import com.example.dbsystem.domain.Teacher;

import com.example.dbsystem.service.DbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DbaServiceImpl implements DbaService {

    @Autowired
    DbaDao dbaDao;

    @Override
    public int insertCourse(Course course) throws Exception {
        return dbaDao.insertCourse(course);
    }

    @Override
    public Course selectCourse(int cno) throws Exception {
        return dbaDao.selectCourse(cno);
    }

    @Override
    public int updateCourse(int cno, Course course) throws Exception {
        return dbaDao.updateCourse(cno,course);
    }

    @Override
    public int deleteCourse(int cno) throws Exception {
        return dbaDao.deleteCourse(cno);
    }

    @Override
    public List<Course> findAllCourse() throws Exception {
        return dbaDao.findAllCourse();
    }

    @Override
    public int insertStudent(Student student) throws Exception {
        return dbaDao.insertStudent(student);
    }

    @Override
    public Student selectStudent(int sno) throws Exception {
        return dbaDao.selectStudent(sno);
    }

    @Override
    public int updateStudent(int sno, Student student) throws Exception {
        return dbaDao.updateStudent(sno,student);
    }

    @Override
    public int deleteStudent(int sno) throws Exception {
        return dbaDao.deleteStudent(sno);
    }

    @Override
    public List<Student> findAllStudent() throws Exception {
        return dbaDao.findAllStudent();
    }

    @Override
    public int insertStudentCourse(int sno, int cno) throws Exception {
        return dbaDao.insertStudentCourse(sno,cno);
    }

    @Override
    public List<Course> selectStudentCourse(int sno) throws Exception {
        return dbaDao.selectStudentCourse(sno);
    }

    @Override
    public int updateStudentCourse(int sno, int oldcno, int newcno) throws Exception {
        return dbaDao.updateStudentCourse(sno,oldcno,newcno);
    }

    @Override
    public int deleteStudentCourse(int sno, int cno) throws Exception {
        return dbaDao.deleteStudentCourse(sno,cno);
    }

    @Override
    public int insertTeacher(Teacher teacher) throws Exception {
        return dbaDao.insertTeacher(teacher);
    }

    @Override
    public Teacher selectTeacher(int tno) throws Exception {
        return dbaDao.selectTeacher(tno);
    }

    @Override
    public int updateTeacher(int tno, Teacher teacher) throws Exception {
        return dbaDao.updateTeacher(tno,teacher);
    }

    @Override
    public int deleteTeacher(int tno) throws Exception {
        return dbaDao.deleteTeacher(tno);
    }

    @Override
    public List<Teacher> findAllTeacher() throws Exception {
        return dbaDao.findAllTeacher();
    }

    @Override
    public int insertTeacherCourse(int tno, int cno) throws Exception {
        return dbaDao.insertTeacherCourse(tno,cno);
    }

    @Override
    public List<Course> selectTeacherCourse(int tno) throws Exception {
        return dbaDao.selectTeacherCourse(tno);
    }

    @Override
    public int updateTeacherCourse(int tno, int oldcno, int newcno) throws Exception {
        return dbaDao.updateTeacherCourse(tno,oldcno,newcno);
    }

    @Override
    public int deleteTeacherCourse(int tno, int cno) throws Exception {
        return dbaDao.deleteTeacherCourse(tno,cno);
    }

    @Override
    public Dba selectDba(int no, String password) throws Exception{
        return dbaDao.selectDba(no,password);
    }

    @Override
    public Teacher loginTeacher(int no, String password) throws Exception {
        return dbaDao.loginTeacher(no,password);
    }

    @Override
    public Student loginStudent(int no, String password) throws Exception {
        return dbaDao.loginStudent(no,password);
    }
}
