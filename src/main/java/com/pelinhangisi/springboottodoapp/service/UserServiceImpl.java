package com.pelinhangisi.springboottodoapp.service;

import com.pelinhangisi.springboottodoapp.dao.UserRepository;
import com.pelinhangisi.springboottodoapp.models.Role;
import com.pelinhangisi.springboottodoapp.models.User;
import com.pelinhangisi.springboottodoapp.request.UserRegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User save(UserRegistrationRequest userRegistrationRequest) {
        User user = new User(userRegistrationRequest.getUsername(), userRegistrationRequest.getPassword(),
                userRegistrationRequest.getEmail(), Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);
    }
}
