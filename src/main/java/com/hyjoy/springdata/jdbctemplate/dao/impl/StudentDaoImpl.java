package com.hyjoy.springdata.jdbctemplate.dao.impl;

import com.hyjoy.springdata.entity.Student;
import com.hyjoy.springdata.jdbctemplate.dao.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyjoy on 2018/3/19.
 */
public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> query() {

        final List<Student> students = new ArrayList<>();
        final String sql = "select * from student";
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setAge(age);
                students.add(student);
            }
        });
        return students;
    }

    @Override
    public void insert(Student student) {
        String sql = "insert into student (name, age) values(?, ?)";
        jdbcTemplate.update(sql, new Object[]{student.getName(), student.getAge()});
    }
}
