package com.xzit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private String name;
    private int age;
    private int sal;
    private String addr;
    private String job;
    private int id;
    public Teacher(String name, String addr, int age, String job, int sal) {
        this.name = name;
        this.addr = addr;
        this.age = age;
        this.job = job;
        this.sal = sal;
    }

    public Teacher(int sal, int id) {
        this.sal = sal;
        this.id = id;
    }
}
