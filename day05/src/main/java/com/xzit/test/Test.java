package com.xzit.test;

import com.xzit.mapper.CompanyMapper;
import com.xzit.model.Company;
import com.xzit.utils.UtilSession;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession = UtilSession.getSession();
        CompanyMapper companyMapper = sqlSession.getMapper(CompanyMapper.class);
//        companyMapper.insertList(Company.getCompanyList());
//        sqlSession.commit();
        List<Company> companies = companyMapper.selectByCity("南京市");
        companies.forEach(System.out::println);
        System.out.println(companyMapper.selectAvgSalByProvince("吉林省"));
        sqlSession.close();
    }
}
