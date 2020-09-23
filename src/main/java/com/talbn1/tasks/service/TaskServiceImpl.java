package com.talbn1.tasks.service;


import com.talbn1.tasks.domain.Task;
import com.talbn1.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * @author talbn on 9/22/2020
 **/

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }
}
