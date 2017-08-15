package com.school053.journal.model.users;

import com.school.journal.model.security.Authority;
import com.school.journal.model.security.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table
public class Child extends User implements Serializable {

    public static final String FIND_BY_CLASS = "Child.findByClass";
    public static final String FIND_ACTIVE = "Child.findActive";

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "school_class_id", nullable = false)
    private SchoolClass schoolClass;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "relationship",
            joinColumns = {@JoinColumn(name = "child_id")},
            inverseJoinColumns = {@JoinColumn(name = "parent_id")})
    private List<Parent> parents;

    public Child() {
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

}