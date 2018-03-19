package com.hyjoy.springdata.jpa.service;

import com.hyjoy.springdata.entity.Employee;
import com.hyjoy.springdata.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hyjoy on 2018/3/19.
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public void save(Employee employee) {
        repository.save(employee);
    }

    public void save(List<Employee> employees) {
        repository.save(employees);
    }
}
