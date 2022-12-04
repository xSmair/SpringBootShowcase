package io.gihub.xsmair.springbootshowcase.data;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Employee {

    public Long getId() {
        return id;
    }

    private String firstName;

    private String lastName;

    private LocalDateTime created;

    private LocalDateTime updated;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee(String firstName, String lastName, LocalDateTime created, LocalDateTime updated, Long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.created = created;
        this.updated = updated;
        this.id = id;
    }
}
