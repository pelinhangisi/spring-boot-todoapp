package com.pelinhangisi.springboottodoapp.dao;

import com.pelinhangisi.springboottodoapp.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
