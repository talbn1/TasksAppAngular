package com.talbn1.tasks.controller;

import com.talbn1.tasks.domain.Task;
import com.talbn1.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

/**
 * @author talbn on 9/22/2020
 **/

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<Task> list() {
        return taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return taskService.save(task);
    }



}
