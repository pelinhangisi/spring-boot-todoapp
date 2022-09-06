package com.pelinhangisi.springboottodoapp.dao;

import com.pelinhangisi.springboottodoapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Long> {
}
