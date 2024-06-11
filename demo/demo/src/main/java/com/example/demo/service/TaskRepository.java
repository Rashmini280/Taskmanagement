package com.example.demo.service;

import com.example.demo.model.Task;
import java.util.List;
import java.util.Optional;

public class TaskRepository {

    public List<Task> findAll() {
        return null;
    }

    public Task save(Task task) {
        return task;
    }

    public void deleteById(Long id) {
    }

    public Optional<Task> findById(Long id) {
        return Optional.empty(); // Return an empty Optional for now
    }
}
