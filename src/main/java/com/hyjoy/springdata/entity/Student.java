package com.hyjoy.springdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by hyjoy on 2018/3/19.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    private int id;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
