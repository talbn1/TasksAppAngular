package com.talbn1.tasks;

import com.talbn1.tasks.domain.Task;
import com.talbn1.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }



    @Bean
    CommandLineRunner renner(TaskService taskService){

        return args -> {
            taskService.save(new Task(1L,"create1", LocalDate.now(),false));
        };
    }
}
