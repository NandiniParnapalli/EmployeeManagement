package com.kog.TeacherProfile.service;

import com.kog.TeacherProfile.entity.CustomUserDetails;
import com.kog.TeacherProfile.entity.User;
import com.kog.TeacherProfile.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user=userRepo.findByName(username);

        return user.map(CustomUserDetails::new).orElseThrow(()->new UsernameNotFoundException("user not found"+username));
    }
}
