package com.pelinhangisi.springboottodoapp.dao;

import com.pelinhangisi.springboottodoapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
