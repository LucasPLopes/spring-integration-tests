package com.linkedin.studentservice.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Arrays;

import static org.assertj.core.api.BDDAssertions.then;

import com.linkedin.studentservice.domain.entity.Student;
import com.linkedin.studentservice.repository.StudentRepository;


@DataJpaTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository repository;

    @Autowired
    private TestEntityManager entityManager;
    
    @Test
    public void testStudentByName(){

        Student saved = this.entityManager.persistFlushFind(new Student(null, "Name"));
        Student student = this.repository.getStudentByName("Name");

        then(student.getId()).isNotNull();
        then(student.getName()).isEqualTo(saved.getName());
        
    }
}
