package com.example.teamtracker.repo;

import org.springframework.data.repository.CrudRepository;
import com.example.teamtracker.models.Task;

public interface TaskRepository extends  CrudRepository<Task, Long> {

}