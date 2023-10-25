package com.example.teamtracker.models;

import org.springframework.data.relational.core.mapping.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, about, performer;
    private LocalDate startDate;
    private LocalDate endDate;

    // getters--------------------------------
    public Long getId() {
        return this.id;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAbout() {
        return this.about;
    }

    public String getPerformer() {
        return this.performer;
    }

    // setters-----------------------------

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // constructors--------------------------

    public Task() {
    }

    public Task(String title, String about, String performer, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.about = about;
        this.performer = performer;
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
