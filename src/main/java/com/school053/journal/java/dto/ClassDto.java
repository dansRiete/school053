package com.school053.journal.java.dto;

public class ClassDto {
    private String id;
    private String name;
    private String curatorLastName;
    private String curatorFirstName;
/*    private String studyingStart;
    private String studyingEnd;*/
    private String curator;

    public ClassDto() {}

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

/*    public String getStudyingStart() {
        return studyingStart;
    }

    public void setStudyingStart(String studyingStart) {
        this.studyingStart = studyingStart;
    }

    public String getStudyingEnd() {
        return studyingEnd;
    }

    public void setStudyingEnd(String studyingEnd) {
        this.studyingEnd = studyingEnd;
    }*/

    /*public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }*/
}
