package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entites.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
