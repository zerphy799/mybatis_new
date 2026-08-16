package com.xzit.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class UtilSession {
    public static SqlSession getSession() {
        try {
            return  new SqlSessionFactoryBuilder().build(
                    Resources.getResourceAsReader("SqlMapConfig.xml")).openSession();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
