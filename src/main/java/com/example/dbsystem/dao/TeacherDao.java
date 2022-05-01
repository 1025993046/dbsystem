package com.example.dbsystem.dao;

import com.example.dbsystem.domain.Attend;
import com.example.dbsystem.domain.Student_course;
import com.example.dbsystem.domain.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface TeacherDao {

    /**
     * 根据工号获取自己的基本信息
     * @return
     * @throws Exception
     */
    @Select("select * from teacher where tno = #{tno}")
    Teacher getmessage(int tno)throws Exception;

    /**
     * 改变自己的基本信息
     * @return
     * @throws Exception
     */
    @Update("update teacher set name=#{name} ,sex=#{sex},password=#{password} where tno = #{tno}")
    int changemessage(Teacher teacher)throws Exception;






    /**
     * 录入考勤数据
     * @param attend
     * @return
     * @throws Exception
     */
    @Insert("insert into attend values(#{sno},#{name},#{classname},#{attend},#{time},#{course})")
    int addattend(Attend attend)throws Exception;

    /**
     * 修改学生考勤信息
     * @param sno
     * @param attend
     * @return
     * @throws Exception
     */
    @Update("update attend set attend=#{attend.attend} where sno = #{sno} and name=#{attend.name} and course=#{attend.course}")
    int updateattend(int sno, Attend attend)throws Exception;

    /**
     * 按姓名查询学生考勤信息
     * @param name
     * @return
     * @throws Exception
     */
    @Select("select * from attend where name = #{name}")
    List<Attend> findByName(String name)throws Exception;

    /**
     * 按时间查询学生考勤信息
     * @param time
     * @return
     * @throws Exception
     */
    @Select("select * from attend where time = #{time}")
    List<Attend> findByTime(String time)throws Exception;

    /**
     * 按班级查询学生考勤信息
     * @param classname
     * @return
     * @throws Exception
     */
    @Select("select * from attend where classname = #{classname}")
    List<Attend> findByClassname(String classname)throws Exception;

    /**
     * 统计本学期各学生的考勤状况
     * @return
     * @throws Exception
     */
    @Select("select * from attend")
    List<Attend> addupattend()throws Exception;


    /**
     * 录入教师所授课程
     * @param tno
     * @param tname
     * @param cno
     * @param cname
     * @return
     * @throws Exception
     */
    @Insert("insert into teacher_course values(#{tno},#{cno})")
    int addTeacherCourse(int tno,String tname,int cno,String cname)throws Exception;










    /**
     * 导入学生所选课程的成绩
     * @param sno
     * @param cno
     * @param grade
     * @return
     * @throws Exception
     */
    @Insert("insert into student_course values(#{sno},#{cno},#{grade})")
    int insertgrade(int sno,int cno,int grade)throws Exception;

    /**
     * 修改学生所学课程的成绩
     * @param sno
     * @param cno
     * @param grade
     * @return
     * @throws Exception
     */
    @Update("update student_course set grade=#{grade} where sno = #{sno} and cno=#{cno}")
    int updategrade(int sno,int cno,int grade)throws Exception;

    /**
     * 删除学生所学课程的成绩
     * @param sno
     * @param cno
     * @return
     * @throws Exception
     */
    @Delete("delete from student_course where cno=#{cno} and sno=#{sno}")
    int deletegrade(int sno,int cno)throws Exception;


    /**
     * 查询指定学生的指定课程的成绩
     * @param sno
     * @param cno
     * @return
     * @throws Exception
     */
    @Select("select student_course.sno,student_course.cno,student_course.grade," +
            "student.name as sname,course.name as cname " +
            "from student_course,student,course " +
            "where student_course.sno=#{sno} " +
            "and student_course.cno=#{cno} " +
            "and student_course.sno=student.sno " +
            "and student_course.cno=course.cno"
              )
    Student_course selectgrade(int sno, int cno)throws Exception;




    /**
     * 统计各个考勤状况信息总数
     * @param attend
     * @return
     * @throws Exception
     */
    @Select("select COUNT(*) from attend where attend=#{attend}")
    int findattendnum(String attend)throws Exception;



}
