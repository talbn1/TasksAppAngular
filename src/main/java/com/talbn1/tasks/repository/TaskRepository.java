package com.talbn1.tasks.repository;

import com.talbn1.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author talbn on 9/22/2020
 **/

public interface TaskRepository extends CrudRepository<Task, Long> {



}
