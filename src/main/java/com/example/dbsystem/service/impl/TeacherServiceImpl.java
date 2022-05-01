package com.example.dbsystem.service.impl;

import com.example.dbsystem.dao.TeacherDao;
import com.example.dbsystem.domain.Attend;
import com.example.dbsystem.domain.Student_course;
import com.example.dbsystem.domain.Teacher;
import com.example.dbsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherDao teacherDao;

    @Override
    public Teacher getmessage(int tno) throws Exception {
        return teacherDao.getmessage(tno);
    }

    @Override
    public int changemessage(Teacher teacher) throws Exception {
        return teacherDao.changemessage(teacher);
    }

    @Override
    public int addattend(Attend attend) throws Exception {
        return teacherDao.addattend(attend);
    }

    @Override
    public int updateattend(int sno, Attend a) throws Exception {
        return teacherDao.updateattend(sno,a);
    }

    @Override
    public List<Attend> findByName(String name) throws Exception {
        return teacherDao.findByName(name);
    }

    @Override
    public List<Attend> findByTime(String time) throws Exception {
        return teacherDao.findByTime(time);
    }

    @Override
    public List<Attend> findByClassname(String classname) throws Exception {
        return teacherDao.findByClassname(classname);
    }

    @Override
    public List<Attend> addupattend() throws Exception {
        return teacherDao.addupattend();
    }

    @Override
    public int addTeacherCourse(int tno, String tname, int cno, String cname) throws Exception {
        return teacherDao.addTeacherCourse(tno,tname,cno,cname);
    }

    @Override
    public int insertgrade(int sno, int cno, int grade) throws Exception {
        return teacherDao.insertgrade(sno,cno,grade);
    }

    @Override
    public int updategrade(int sno, int cno, int grade) throws Exception {
        return teacherDao.updategrade(sno,cno,grade);
    }

    @Override
    public int deletegrade(int sno, int cno) throws Exception {
        return teacherDao.deletegrade(sno,cno);
    }

    @Override
    public Student_course selectgrade(int sno, int cno) throws Exception {
        return teacherDao.selectgrade(sno,cno);
    }

    @Override
    public int findattendnum(String attend)throws Exception {
        return teacherDao.findattendnum(attend);
    }
}
