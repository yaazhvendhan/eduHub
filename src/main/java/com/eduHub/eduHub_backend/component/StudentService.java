package com.eduHub.eduHub_backend.component;

import org.springframework.stereotype.Component;

@Component
public class StudentService {
    private int id;
    private String firstName;
    private String lastName;

    // Constructor
    public StudentService() {
    }

    public StudentService(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
