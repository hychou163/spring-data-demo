package com.hyjoy.springdata.statement.dao.impl;

import com.hyjoy.springdata.entity.Student;
import com.hyjoy.springdata.statement.dao.StudentDao;
import com.hyjoy.springdata.statement.util.JDBCUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyjoy on 2018/3/19.
 */
public class StudentDaoImpl implements StudentDao {
    public List<Student> query() {

        String sql = "select * from student";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Student> students = new ArrayList<>();
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                students.add(new Student(id, name, age));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection);
            JDBCUtils.close(preparedStatement);
            JDBCUtils.close(resultSet);
        }

        return students;
    }

    public void insert(Student student) {
        String sql = "INSERT INTO student(name, age) values(?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;


        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection);
            JDBCUtils.close(preparedStatement);
            JDBCUtils.close(resultSet);
        }
    }


}
