package com.talbn1.tasks.service;

import com.talbn1.tasks.domain.Task;
import org.springframework.stereotype.Service;

/**
 * @author talbn on 9/22/2020
 **/

@Service
public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
