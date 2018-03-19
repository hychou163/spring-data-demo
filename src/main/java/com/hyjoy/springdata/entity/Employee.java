package com.hyjoy.springdata.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by hyjoy on 2018/3/19.
 */
@Data
@Entity
@NoArgsConstructor
public class Employee {
    @GeneratedValue
    @Id
    private int id;
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
