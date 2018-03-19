package com.hyjoy.springdata.jpa.service;

import com.hyjoy.springdata.entity.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyjoy on 2018/3/19.
 */
public class EmployeeServiceTest {


    private ApplicationContext applicationContext;
    private EmployeeService service;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("beans-jpa.xml");
        service = applicationContext.getBean(EmployeeService.class);
    }

    @After
    public void tearDown() throws Exception {
        applicationContext = null;
    }


    @Test
    public void save() {
        Employee employee = new Employee("张三", 30);
        service.save(employee);
    }

    @Test
    public void saveList() {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Employee employee = new Employee("test" + i, 100 - i);
            employees.add(employee);
        }
        service.save(employees);
    }
}