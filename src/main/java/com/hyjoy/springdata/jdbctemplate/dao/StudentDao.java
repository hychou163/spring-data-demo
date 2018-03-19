package com.hyjoy.springdata.jdbctemplate.dao;

import com.hyjoy.springdata.entity.Student;

import java.util.List;

/**
 * Created by hyjoy on 2018/3/19.
 */
public interface StudentDao {

    List<Student> query();

    void insert(Student student);
}
