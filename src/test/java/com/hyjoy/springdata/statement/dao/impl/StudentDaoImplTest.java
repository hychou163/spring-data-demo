package com.hyjoy.springdata.statement.dao.impl;

import com.hyjoy.springdata.entity.Student;
import com.hyjoy.springdata.statement.dao.StudentDao;
import org.junit.Test;

import java.util.List;

/**
 * Created by hyjoy on 2018/3/19.
 */
public class StudentDaoImplTest {

    @Test
    public void query() {
        StudentDao studentDao = new StudentDaoImpl();
        List<Student> students = studentDao.query();
        for (Student student : students) {
            System.out.println(student);
        }

    }

    @Test
    public void insert() {

        Student student = new Student("李四", 32);
        StudentDaoImpl studentDao = new StudentDaoImpl();
        studentDao.insert(student);
    }
}