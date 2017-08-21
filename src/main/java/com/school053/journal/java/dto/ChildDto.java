package com.school053.journal.java.dto;

public class ChildDto {
    private String id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private ClassDto schoolClass;

    public ChildDto() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public ClassDto getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(ClassDto schoolClass) {
        this.schoolClass = schoolClass;
    }
}
