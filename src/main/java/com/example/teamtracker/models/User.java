package com.example.teamtracker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name, surname, position, email, password;
    private int telephone;

    // getters-----------------------------------
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPosition() {
        return this.position;
    }

    public String getEmail() {
        return this.email;
    }

    public int getTelephone() {
        return this.telephone;
    }

    public String getpassword() {
        return this.password;
    }

    // setters--------------------------------

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // constructors----------------------------------

    public User() {
    }

    public User(String name, String surname, String position, String email, String password, int telephone) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
    }

}
