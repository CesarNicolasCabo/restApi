package com.springboot.restApi.service;

import com.springboot.restApi.domain.Task;
import com.springboot.restApi.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTask() {
        return (List<Task>) taskRepository.findAll();
    }
}
