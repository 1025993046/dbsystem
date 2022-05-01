package com.example.dbsystem.dao;

import com.example.dbsystem.domain.Course;
import com.example.dbsystem.domain.Dba;
import com.example.dbsystem.domain.Student;
import com.example.dbsystem.domain.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface DbaDao {
    /**
     * 录入课程信息
     * @param course
     * @throws Exception
     * @return
     */
    @Insert("insert into course values(#{cno},#{name})")
    int insertCourse(Course course) throws Exception;


    /**
     * 查询指定课程信息
     * @param cno 课程号，下同
     * @return
     * @throws Exception
     */
    @Select("select * from course where cno = #{cno}")
    Course selectCourse(int cno) throws Exception;

    /**
     * 修改课程信息
     * @param cno
     * @param course
     * @throws Exception
     * @return
     */
    @Update("update course set name=#{course.name} where cno = #{cno}")
    int updateCourse(int cno , Course course) throws Exception;


    /**
     * 删除课程信息
     * @param cno
     * @throws Exception
     * @return
     */
    @Delete("delete from course where cno=#{cno}")
    int deleteCourse(int cno) throws Exception;

    /**
     * 查询所有课程信息
     * @return
     * @throws Exception
     */
    @Select("select * from course")
    List<Course> findAllCourse() throws Exception;



    /**
     * 录入学生信息
     * @param student
     * @throws Exception
     * @return
     */
    @Insert("insert into student values(#{name},#{sex},#{sno},#{password},#{classname})")
    int insertStudent(Student student) throws Exception;



    /**
     * 查询指定学生信息
     * @param sno  学生的学号，下同
     * @return
     * @throws Exception
     */
    @Select("select * from student where sno = #{sno}")
    Student selectStudent(int sno) throws Exception;



    /**
     * 修改学生信息
     * @param sno
     * @param student
     * @throws Exception
     * @return
     */
    @Update("update student set name=#{student.name} , sex=#{student.sex},password=#{student.password},classname=#{student.classname} where sno =#{sno}")
    int updateStudent(int sno , Student student) throws Exception;



    /**
     * 删除学生信息
     * @param sno
     * @throws Exception
     * @return
     */
    @Delete("delete from student where sno=#{sno}")
    int deleteStudent(int sno) throws Exception;

    /**
     * 查询所有学生信息
     * @return
     * @throws Exception
     */
    @Select("select * from student")
    List<Student> findAllStudent() throws Exception;


    /**
     * 录入学生与所上课程的信息,初始化成绩为null
     * @param sno
     * @param cno
     * @return
     * @throws Exception
     */
    @Insert("insert into student_course values(#{sno},#{cno},null)")
    int insertStudentCourse(int sno,int cno) throws Exception;

    /**
     * 查询指定学生与他所上的课程
     * @param sno
     * @return
     * @throws Exception
     */
    @Select("select student_course.cno,name " +
            "from student_course,course " +
            "where student_course.sno=#{sno} " +
            "and student_course.cno=course.cno")
    List<Course> selectStudentCourse(int sno)throws Exception;

    /**
     * 修改学生与所上课程的信息
     * @param sno
     * @param oldcno
     * @param newcno
     * @return
     * @throws Exception
     */
    @Update("update student_course set cno = #{newcno} where sno = #{sno} and cno = #{oldcno}")
    int updateStudentCourse(int sno, int oldcno,int newcno)throws Exception;

    /**
     * 删除学生与所上课程的信息
     * @param sno
     * @param cno
     * @return
     * @throws Exception
     */
    @Delete("delete from student_course where sno=#{sno} and cno=#{cno}")
    int deleteStudentCourse(int sno,int cno)throws Exception;



    /**
     * 录入教师信息
     * @param teacher
     * @throws Exception
     * @return
     */
    @Insert("insert into teacher values(#{name},#{sex},#{tno},#{password})")
    int insertTeacher(Teacher teacher) throws Exception;


    /**
     * 查询指定教师信息
     * @param tno 教师的工号，下同
     * @return
     * @throws Exception
     */
    @Select("select * from teacher where tno = #{tno}")
    Teacher selectTeacher(int tno) throws Exception;


    /**
     * 修改教师信息
     * @param tno
     * @param teacher
     * @throws Exception
     * @return
     */
    @Update("update teacher set name=#{teacher.name},sex=#{teacher.sex} ,password=#{teacher.password} where tno = #{tno}")
    int updateTeacher(int tno , Teacher teacher) throws Exception;


    /**
     * 删除教师信息
     * @param tno
     * @throws Exception
     * @return
     */
    @Delete("delete from teacher where tno=#{tno}")
    int deleteTeacher(int tno) throws Exception;


    /**
     * 查询所有教师信息
     * @return
     * @throws Exception
     */
    @Select("select * from teacher")
    List<Teacher> findAllTeacher() throws Exception;




    /**
     * 录入教师与所上课程的信息
     * @param tno
     * @param cno
     * @return
     * @throws Exception
     */
    @Insert("insert into teacher_course values(#{tno},#{cno})")
    int insertTeacherCourse(int tno,int cno) throws Exception;

    /**
     * 查询指定教师与他所上的课程
     * @param tno
     * @return
     * @throws Exception
     */
    @Select("select teacher_course.cno,name " +
            "from teacher_course,course " +
            "where teacher_course.tno=#{tno} " +
            "and teacher_course.cno=course.cno")
    List<Course> selectTeacherCourse(int tno)throws Exception;

    /**
     * 修改教师与所上课程的信息
     * @param tno
     * @param oldcno
     * @param newcno
     * @return
     * @throws Exception
     */
    @Update("update teacher_course set cno = #{newcno} where tno = #{tno} and cno = #{oldcno}")
    int updateTeacherCourse(int tno, int oldcno,int newcno)throws Exception;

    /**
     * 删除教师与所上课程的信息
     * @param tno
     * @param cno
     * @return
     * @throws Exception
     */
    @Delete("delete from teacher_course where tno=#{tno} and cno=#{cno}")
    int deleteTeacherCourse(int tno,int cno)throws Exception;

    @Select("select * from dba where dbano=#{no} and password=#{password}")
    Dba selectDba(int no, String password)throws Exception;

    @Select("select * from teacher where tno=#{no} and password=#{password}")
    Teacher loginTeacher(int no, String password)throws Exception;

    @Select("select * from student where sno=#{no} and password=#{password}")
    Student loginStudent(int no, String password)throws Exception;
}
