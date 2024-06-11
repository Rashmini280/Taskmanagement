package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity

public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean completed;

    public String getTitle() {
        return null;
    }
    public String getDescription(){

        return null;
    }
    public Long getId(){

        return null;
    }
    public LocalDate getDueDate(){

        return null;
    }
    public boolean getCompleted(){

        return false;
    }

    public void  isCompleted() {
    }

    public void setId(){

    }
    public void setTitle(String title){

    }
    public void setDescription(String description){

    }
    public void setCompleted(){

    }
    public void setDueDate(LocalDate dueDate){

    }
}
