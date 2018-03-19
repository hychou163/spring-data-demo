package com.hyjoy.springdata.jdbctemplate.dao.impl;

import com.hyjoy.springdata.entity.Student;
import com.hyjoy.springdata.jdbctemplate.dao.StudentDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by hyjoy on 2018/3/19.
 */
public class StudentDaoImplTest {

    private ApplicationContext applicationContext;
    private StudentDao studentDao;

    @Before
    public void tearup() {
        applicationContext = new ClassPathXmlApplicationContext("beans-jdbctemplate.xml");
        studentDao = (StudentDao) applicationContext.getBean("studentDao");
    }

    @After
    public void tearDown() {
        applicationContext = null;
    }

    @Test
    public void query() {
        List<Student> students = studentDao.query();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void insert() {

        Student student = new Student("王五", 33);
        studentDao.insert(student);

    }
}