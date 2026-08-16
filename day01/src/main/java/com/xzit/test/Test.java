package com.xzit.test;

import com.xzit.mapper.TeacherMapper;
import com.xzit.model.Teacher;
import com.xzit.utils.UtilSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args) {
       SqlSession sqlSession = UtilSession.getSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.selectAll();
        teachers.forEach(System.out::println);
        sqlSession.close();
    }
}
