package com.xzit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Company {
    private int id;
    private String name;
    private String addr;
    private String job;
    private int sal;
    private int age;

    public Company(String name, String addr, int age, String job, int sal) {
        this.name = name;
        this.addr = addr;
        this.age = age;
        this.job = job;
        this.sal = sal;
    }
    public static List<Company> getCompanyList() {
        List<Company> companyList=new ArrayList<>();
        companyList.add(new Company("张三","江苏省南京市",35,"区域总监",20000));
        companyList.add(new Company("李四","江苏省苏州市",32,"销售经理",15000));
        companyList.add(new Company("王五","吉林省长春市",26,"销售员",8000));
        companyList.add(new Company("赵六","四川省成都市",27,"财务",10000));
        companyList.add(new Company("刘七","吉林省长春市",24,"销售员",7000));
        companyList.add(new Company("吴八","陕西省西安市",31,"销售员",6000));
        return companyList;
    }
}
