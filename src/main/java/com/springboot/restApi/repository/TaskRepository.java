package com.springboot.restApi.repository;

import com.springboot.restApi.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
