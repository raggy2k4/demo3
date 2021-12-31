package com.example.demo;

import com.example.demo.task.Task;
import com.example.demo.task.TaskRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.mongodb.repository.MongoRepository;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(Demo3Application.class, args);

        Task task = new Task("marcin", "zadanie");

        MongoRepository taskRepository =  context.getBean(TaskRepository.class);

        taskRepository.insert(task);
    }

}
