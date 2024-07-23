package com.example.teamtracker.models;
import org.springframework.data.relational.core.mapping.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "projects")
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, about, team;

    //getters-----------------------------------------------------------------------------

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAbout() {
        return about;
    }

    public String getTeam() {
        return team;
    }

    //setters--------------------------------------------------------------------------------

    public void setId(Long id) {
        this.id = id;
    }    

    public void setTitle(String title) {
        this.title = title;
    }    

    public void setAbout(String about) {
        this.about = about;
    }   

    public void setTeam(String team) {
        this.team = team;
    }

    //constructors-------------------------------------------------------------------------------

    public Project() {
    }

    public Project(String title, String about, String team) {
        this.title = title;
        this.about = about;
        this.team = team;
    }

    


    
}
