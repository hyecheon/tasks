package com.hyecheon.tasks.service;

import com.hyecheon.tasks.domain.Task;
import com.hyecheon.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Flux<Task> list() {
        return taskRepository.findAll();
    }

    @Override
    public Mono<Task> save(Task task) {
        return taskRepository.save(task);
    }
}
