package com.example.teamtracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.teamtracker.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}