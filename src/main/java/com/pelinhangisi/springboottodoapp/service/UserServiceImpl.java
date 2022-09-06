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
        User user = new User();
        user.setUsername(userRegistrationRequest.getUsername());
        user.setPassword(userRegistrationRequest.getPassword());
        user.setEmail(userRegistrationRequest.getEmail());
        user.setRoles(Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);
    }
}
