package com.example.teamtracker.models;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, about, performer;

    // getters--------------------------------
    public Long getId() {
        return this.id;
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

    public Task(String title, String about, String performer) {
        this.title = title;
        this.about = about;
        this.performer = performer;
    }

}
