package com.xzit.mapper;

import com.xzit.model.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from teacher")
    List<Teacher> selectAll();
    void insert(@Param("List") List<Teacher> teacherList);
    List<Teacher> selectByAddr(@Param("addr") String addr);
    Integer selectAVGSal(@Param("addr") String addr);
}
