package com.example.teamtracker.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.teamtracker.models.Task;
import com.example.teamtracker.repo.TaskRepository;

@Controller 
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/task")
    public String taskMain(Model model){
        Iterable<Task> task = taskRepository.findAll();
        model.addAttribute("task", task);
        return "task-main";
    }

    @GetMapping("/task/add")
    public String taskAdd(Model model){
        return "task-add";
    }
    
    @PostMapping("/task/add")
    public String taskUpdate(@RequestParam String title,
                             @RequestParam String about,
                             @RequestParam String performer,
                             @RequestParam LocalDate startDate,
                             @RequestParam LocalDate endDate,
                             Model model){
        Task task = new Task(title, about, performer, startDate, endDate);
        taskRepository.save(task);
        return"redirect:/task";
    }

    
}
