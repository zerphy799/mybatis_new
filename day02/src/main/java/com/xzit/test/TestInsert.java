package com.xzit.test;

import com.xzit.mapper.TeacherMapper;
import com.xzit.model.Teacher;
import com.xzit.utils.UtilSession;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class TestInsert {
    public static void main(String[] args) {
       SqlSession sqlSession = UtilSession.getSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("张三","江苏省南京市",35,"区域总监",20000));
        teacherList.add(new Teacher("李四","江苏省苏州市",32,"销售经理",15000));
        teacherList.add(new Teacher("王五","吉林省长春市",26,"销售员",8000));
        teacherList.add(new Teacher("赵六","四川省成都市",27,"财务",10000));
        teacherList.add(new Teacher("刘七","吉林省长春市",24,"销售员",7000));
        teacherList.add(new Teacher("吴八","陕西省西安市",31,"销售员",6000));
        teacherMapper.insert(teacherList);
        sqlSession.commit();
        sqlSession.close();
    }
}
