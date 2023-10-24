package com.example.teamtracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.teamtracker.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
