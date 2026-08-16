package com.xzit.mapper;

import com.xzit.model.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from teacher")
    List<Teacher> selectAll();
}
