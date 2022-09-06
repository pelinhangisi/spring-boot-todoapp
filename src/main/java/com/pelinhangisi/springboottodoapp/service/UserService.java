package com.pelinhangisi.springboottodoapp.service;

import com.pelinhangisi.springboottodoapp.models.User;
import com.pelinhangisi.springboottodoapp.request.UserRegistrationRequest;

public interface UserService {
    User save(UserRegistrationRequest userRegistrationRequest);
}
