package com.example.teamtracker.repo;

import org.springframework.data.repository.CrudRepository;
import com.example.teamtracker.models.Project;

public interface ProjectRepository extends  CrudRepository<Project, Long> {

}