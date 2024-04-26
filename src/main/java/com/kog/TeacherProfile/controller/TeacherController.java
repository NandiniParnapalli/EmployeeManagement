package com.kog.TeacherProfile.controller;

import com.kog.TeacherProfile.entity.Teacher;
import com.kog.TeacherProfile.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @PostMapping("/admin/save")
  //  @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Teacher save(@RequestBody Teacher teacher){

        return  teacherService.save(teacher);
    }

    @GetMapping("/user/getall")
  //  @PreAuthorize("hasAuthority('ROLE_USER')")
    public List<Teacher> getAll(){
        return teacherService.getAll();
    }
}
