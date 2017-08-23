package com.school053.journal.java.dto;

public class ClassDto {
    private String id;
    private String name;
    /*private String curatorLastName;
    private String curatorFirstName;*/
    /*private String curator;*/
/*    private String active;*/

    public ClassDto() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ClassDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public String getCuratorLastName() {
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
    }*/

    /*public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }*/
}
