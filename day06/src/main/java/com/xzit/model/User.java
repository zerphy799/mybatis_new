package com.xzit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer uid;
    private String uname;
    private String pwd;
    private LocalDateTime lasttime;
}
