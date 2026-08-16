package com.xzit.mapper;

import com.xzit.model.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    List<Permission> findPermByRid(@Param("rid") Integer rid);
}
