package com.kog.TeacherProfile.service;

import com.kog.TeacherProfile.entity.Teacher;
import com.kog.TeacherProfile.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {

    private final TeacherRepository teacherRepository;

     public Teacher save(Teacher teacher){
        return teacherRepository.save(teacher);
     }
    public List<Teacher> getAll(){
        return teacherRepository.findAll();
    }
}
