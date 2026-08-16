package com.xzit.test;

import com.xzit.mapper.TeacherMapper;
import com.xzit.model.Teacher;
import com.xzit.utils.UtilSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestSelect {
    public static void main(String[] args) {
        SqlSession sqlSession = UtilSession.getSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        String addr="江苏省";
        List<Teacher> teachers = teacherMapper.selectByAddr("%" + addr + "%");
        teachers.forEach(System.out::println);

       // Integer i = teacherMapper.selectAVGSal("%吉林省%");
       // System.out.println(i);
        sqlSession.close();

    }

}
