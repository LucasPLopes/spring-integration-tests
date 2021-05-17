package com.linkedin.studentservice.domain.entity;

import lombok.*;
import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Student {
    
    @Id @GeneratedValue
    private Integer id;
    private String name;
    private boolean active;
    private Integer grade;

    public Student(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    
}
