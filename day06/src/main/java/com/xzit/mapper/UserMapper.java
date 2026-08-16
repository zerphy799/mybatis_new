package com.xzit.mapper;

import com.xzit.model.Role;
import com.xzit.model.User;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface UserMapper {
    User login(@Param("uname") String uname, @Param("pwd") String pwd);

    int updateLastTime(@Param("uid") Integer uid, @Param("now") LocalDateTime now);

    List<Role> findRolesByUid(@Param("uid") Integer uid);

}
