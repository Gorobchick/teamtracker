package com.example.teamtracker.repo;

import org.springframework.data.repository.CrudRepository;
import com.example.teamtracker.models.User;

public interface UserRepository extends  CrudRepository<User, Long> {

}
