package com.hyecheon.tasks.controller;

import com.hyecheon.tasks.domain.Task;
import com.hyecheon.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Flux<Task> list() {
        System.out.println("test");
        return this.taskService.list();
    }

    @PostMapping("/save")
    public Mono<Task> saveTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }
}
