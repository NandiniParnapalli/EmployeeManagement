package com.kog.TeacherProfile.controller;

import com.kog.TeacherProfile.entity.Teacher;
import com.kog.TeacherProfile.entity.User;
import com.kog.TeacherProfile.service.TeacherService;
import com.kog.TeacherProfile.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public User save(@RequestBody User user){
        return  userService.save(user);
    }

    @GetMapping("/getall")
    public List<User> getAll(){
        return userService.getAll();
    }
}

