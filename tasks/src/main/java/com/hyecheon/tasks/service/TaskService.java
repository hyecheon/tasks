package com.hyecheon.tasks.service;

import com.hyecheon.tasks.domain.Task;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TaskService {
    Flux<Task> list();

    Mono<Task> save(Task task);
}
