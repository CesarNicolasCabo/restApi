package com.springboot.restApi.controller;

import com.springboot.restApi.domain.Task;
import com.springboot.restApi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="todolist")
public class TaskController {

    TaskService taskService;

    public TaskController(@Autowired TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value="tasks")
    public List<Task> getTasks() {
        return taskService.getTask();
    }
}
