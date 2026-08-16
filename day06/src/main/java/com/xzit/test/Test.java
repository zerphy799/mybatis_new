package com.xzit.test;

import com.xzit.mapper.PermissionMapper;
import com.xzit.mapper.UserMapper;
import com.xzit.model.Permission;
import com.xzit.model.Role;
import com.xzit.model.User;
import com.xzit.utils.UtilSession;
import org.apache.ibatis.session.SqlSession;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession = UtilSession.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        PermissionMapper permMapper = sqlSession.getMapper(PermissionMapper.class);
        System.out.println("欢迎使用，请输入对应的用户名与密码");
        String name;
        String pwd;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        pwd = sc.nextLine();

        User loginUser = userMapper.login(name, pwd);
        if(loginUser == null){
            System.out.println("账号或密码错误！");
            sqlSession.close();
            return;
        }
        userMapper.updateLastTime(loginUser.getUid(), LocalDateTime.now());
        sqlSession.commit();

        List<Role> roleList = userMapper.findRolesByUid(loginUser.getUid());
        for(Role role : roleList){
            System.out.println(loginUser.getUname()+"是"+role.getRname());
            List<com.xzit.model.Permission> perms = permMapper.findPermByRid(role.getRid());
            System.out.println("可操作菜单：");
            for(Permission p : perms){
                System.out.println(p.getUrl()+p.getPname());
            }
        }
        sqlSession.close();
    }
}
