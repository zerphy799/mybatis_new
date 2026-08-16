package com.xzit.mapper;

import com.xzit.model.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from teacher")
    List<Teacher> selectAll();
    @Insert("insert into mybatis.teacher(name, addr, age, job, sal) VALUES (#{name},#{addr},#{age},#{job},#{sal})")
    int insertOne(Teacher teacher);
    @Insert({"<script>",
            "INSERT INTO mybatis.teacher(name, addr, age, job, sal) VALUES",
            "<foreach collection='teacherList' item='item' separator=','>",
            "(#{item.name},#{item.addr},#{item.age},#{item.job},#{item.sal})",
            "</foreach>",
            "</script>"
})
    int insertBatch(@Param("teacherList") List<Teacher> teacherList);
    @Update({
            "<script>",
    "update mybatis.teacher",
    " <trim prefix='set' suffixOverrides=','>",
     "<if test='teacher.name!=null'>name=#{teacher.name},</if>",
            "<if test='teacher.addr!=null'>addr=#{teacher.addr},</if>",
            "<if test='teacher.age!=null'>age=#{teacher.age},</if>",
            "<if test='teacher.job!=null'>job=#{teacher.job},</if>",
            "<if test='teacher.sal!=null'>sal=#{teacher.sal},</if>",
            "</trim>",
            "where id= #{teacher.id}",
            "</script>"
    })
    int updateBatch(@Param("teacher") Teacher teacher);
    @Delete("delete from mybatis.teacher where id = #{id}")
    int deleteById(int id);
}
