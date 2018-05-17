package com.hyecheon.tasks.repository;

import com.hyecheon.tasks.domain.Task;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TaskRepository extends ReactiveMongoRepository<Task, String> {

}
