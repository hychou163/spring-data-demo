package com.hyjoy.springdata.statement.dao;


import com.hyjoy.springdata.entity.Student;

import java.util.List;

/**
 * Created by hyjoy on 2018/3/19.
 */
public interface StudentDao {

    /**
     * 查询
     *
     * @return
     */
    public List<Student> query();

    /**
     * 保存student,此处只做插入
     *
     * @param student
     */
    public void insert(Student student);
}
