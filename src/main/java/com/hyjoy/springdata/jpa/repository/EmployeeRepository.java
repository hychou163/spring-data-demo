package com.hyjoy.springdata.jpa.repository;

import com.hyjoy.springdata.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by hyjoy on 2018/3/19.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {// CrudRepository<Employee, Integer> {

    Employee findByName(String name);


    List<Employee> findByNameAndAge(String name, int age);

    List<Employee> findByAgeBetween(int min, int max);


    List<Employee> findByAgeLessThan(int age);
}
