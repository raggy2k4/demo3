package com.example.demo;

import com.example.demo.task.Task;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@DataMongoTest
class TestAppIT {

    @Autowired
    MongoRepository taskRepository;

    @Test
    void contextLoads() {
        System.out.println(taskRepository.hashCode());

        Task task = new Task("marcin", "TEST");


        taskRepository.insert(task);

    }
}
