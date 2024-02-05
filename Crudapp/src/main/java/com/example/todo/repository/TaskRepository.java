package com.example.todo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.todo.model.Task;

public interface TaskRepository extends MongoRepository<Task, String> {
}
