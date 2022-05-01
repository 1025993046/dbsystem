package com.example.dbsystem.service;

import com.example.dbsystem.domain.Attend;
import com.example.dbsystem.domain.Student;
import com.example.dbsystem.domain.Student_course;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service
public interface StudentService {

    List<Student_course> selectgrade(int sno)throws Exception;

    List<Attend> selectattend(int sno)throws Exception;

    Student getmessage(int sno)throws Exception;

    int changemessage(Student student) throws Exception;
}
