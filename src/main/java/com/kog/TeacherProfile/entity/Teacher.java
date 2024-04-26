package com.kog.TeacherProfile.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String salary;
}
