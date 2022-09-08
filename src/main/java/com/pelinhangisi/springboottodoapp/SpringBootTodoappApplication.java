package com.pelinhangisi.springboottodoapp;

import com.pelinhangisi.springboottodoapp.dao.TodoItemRepository;
import com.pelinhangisi.springboottodoapp.dao.UserRepository;
import com.pelinhangisi.springboottodoapp.models.TodoItem;
import com.pelinhangisi.springboottodoapp.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@RequiredArgsConstructor
@EnableWebMvc
public class SpringBootTodoappApplication implements CommandLineRunner {

    private final UserRepository userRepository;
    private final TodoItemRepository todoItemRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTodoappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setId(1L);
        user.setPassword("password");
        user.setFirstName("Pelin");
        user.setLastName("Hangişi");
        user.setEmail("pelinhangisi@gmail.com");

        TodoItem todoItem = new TodoItem();
        todoItem.setId(1L);
        todoItem.setDescription("Start the Todo-App");

        user.getTodoItems().add(todoItem);

        todoItemRepository.save(todoItem);
        userRepository.save(user);


    }
}
