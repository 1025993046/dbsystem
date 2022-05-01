package com.example.dbsystem.service.impl;

import com.example.dbsystem.dao.StudentDao;
import com.example.dbsystem.domain.Attend;
import com.example.dbsystem.domain.Student;
import com.example.dbsystem.domain.Student_course;
import com.example.dbsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;


    @Override
    public List<Student_course> selectgrade(int sno) throws Exception {
        return studentDao.selectgrade(sno);
    }

    @Override
    public List<Attend> selectattend(int sno) throws Exception {
        return studentDao.selectattend(sno);
    }

    @Override
    public Student getmessage(int sno) throws Exception {
        return studentDao.getmessage(sno);
    }

    @Override
    public int changemessage(Student student) throws Exception {
        return studentDao.changemessage(student);
    }
}
