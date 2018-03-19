package com.hyjoy.springdata.jpa.repository;

import com.hyjoy.springdata.entity.Employee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by hyjoy on 2018/3/19.
 */
public class EmployeeRepositoryTest {

    private ApplicationContext applicationContext;
    private EmployeeRepository repository;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("beans-jpa.xml");
        repository = applicationContext.getBean(EmployeeRepository.class);
    }

    @After
    public void tearDown() throws Exception {
        applicationContext = null;
    }

    @Test
    public void findByName() {
        Employee employee = repository.findByName("张三");
        Assert.assertNotNull(employee);
    }

    public void save() {
        for (int i = 0; i < 100; i++) {
            Employee employee = new Employee("test" + i, 100 - i);
            repository.save(employee);
        }
    }


    @Test
    public void findByNameAndAge() {
        List<Employee> employees = repository.findByNameAndAge("张三", 30);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void findByAgeBetween() {
        List<Employee> employees = repository.findByAgeBetween(10, 30);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void findByAgeLessThan() {
        List<Employee> employees = repository.findByAgeLessThan(10);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}