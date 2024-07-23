package com.example.teamtracker.controllers;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.teamtracker.models.Project;
import com.example.teamtracker.repo.ProjectRepository;

@Controller
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;
//View project/ts ---------------------------------------------------
    @GetMapping("/project")
    public String projectMain(Model model){
        Iterable<Project> projects = projectRepository.findAll();
        model.addAttribute("projects", projects);
        return "project-main";        
    }

//creating project --------------------------------------------------    
    @GetMapping("/project/new")
    public String projectNew(Model model){
        return "project-new";
    }
    
    @PostMapping("/project/new")
    public String projectPostNew(@RequestParam String title,
                                @RequestParam String about,
                                @RequestParam String team, 
                                Model model){
        Project project = new Project(title, about, team);
        projectRepository.save(project);
        return"redirect:/project";
    } 

//Editing project ---------------------------------------------------
    @GetMapping("/project/{id}/edit")
    public String projectEdit (@PathVariable(value = "id")long id, Model model) {
        if(!projectRepository.existsById(id)){
            return "redirect:/project";
        }
        Optional<Project> project = projectRepository.findById(id);
        ArrayList<Project> res = new ArrayList<>();
        project.ifPresent(res::add);
        model.addAttribute("project", res);
             
        return "project-edit";
    }

    @PostMapping("/project/{id}/edit")
    public String projectPostEdit (@PathVariable(value = "id") long id,
                                   @RequestParam String title,
                                   @RequestParam String about,
                                   @RequestParam String team,
                                   Model model){
        Project project = projectRepository.findById(id).orElseThrow();
        project.setTitle(title);
        project.setAbout(about);
        project.setTeam(team);
        projectRepository.save(project);
        return"redirect:/blog";
    }
    
//Deleting project ---------------------------------------------------
    @PostMapping("/project/{id}/remove")
    public String blogPostRemove (@PathVariable(value = "id") long id, Model model){
        Project project = projectRepository.findById(id).orElseThrow();
        projectRepository.delete(project);
        return"redirect:/blog";
    }    
}