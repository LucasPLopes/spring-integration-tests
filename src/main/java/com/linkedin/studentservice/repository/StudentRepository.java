package com.linkedin.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.linkedin.studentservice.domain.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student getStudentByName(String name);

    @Query("select avg(grade) from Student where active = true")
    Double getAvgGradeForActiveStudents();
    
}
