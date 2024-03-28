package com.cp.cruddemo.dao;

import com.cp.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    public void save(Student student);
    public Student findById(Integer id);

    List<Student> findAll();
}
