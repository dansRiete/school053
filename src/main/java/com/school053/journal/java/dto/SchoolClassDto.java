package com.school053.journal.java.dto;

public class SchoolClassDto {
    private String id;
    private String name;
    private String curatorLastName;
    private String curatorFirstName;
    private String active;

    public SchoolClassDto() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuratorLastName() {
        return curatorLastName;
    }

    public void setCuratorLastName(String curatorLastName) {
        this.curatorLastName = curatorLastName;
    }

    public String getCuratorFirstName() {
        return curatorFirstName;
    }

    public void setCuratorFirstName(String curatorFirstName) {
        this.curatorFirstName = curatorFirstName;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
