package com.xzit.test;

import com.xzit.mapper.TeacherMapper;
import com.xzit.model.Teacher;
import com.xzit.utils.UtilSession;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args) {
       SqlSession sqlSession = UtilSession.getSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
//        teacherMapper.insertOne(new Teacher("李白","江苏省扬州市",25,"销售",5200));
//        sqlSession.commit();
        List<Teacher> teachers = teacherMapper.selectAll();
        teachers.forEach(System.out::println);
        teacherMapper.updateBatch(new Teacher(6000,10));
        sqlSession.commit();
        teachers = teacherMapper.selectAll();
        teachers.forEach(System.out::println);
        teacherMapper.deleteById(6);
        sqlSession.commit();
        teachers = teacherMapper.selectAll();
        teachers.forEach(System.out::println);
        sqlSession.close();
    }
}
