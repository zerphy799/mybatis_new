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
}
