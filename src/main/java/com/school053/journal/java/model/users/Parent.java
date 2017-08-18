package com.school053.journal.java.model.users;

import com.school053.journal.java.model.security.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="parents")
public class Parent extends User {

    public static final String FIND_ACTIVE = "Parent.findActive";
    public static final String FIND_AVAILABLE = "Parent.findAvailable";

    @Column(name = "job", length = 64)
    private String job;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "relationship",
            joinColumns = {@JoinColumn(name = "parent_id")},
            inverseJoinColumns = {@JoinColumn(name = "child_id")})
    private List<Child> children;

    public Parent() {
    }

    public Parent(String job) {
        this.job = job;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}