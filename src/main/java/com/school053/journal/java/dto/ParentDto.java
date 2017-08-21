package com.school053.journal.java.dto;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class ParentDto {

    private String id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String nickname;
    private String email;
    private String phone;
    private String job;

    public ParentDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParentDto parentDto = (ParentDto) o;

        if (id != null ? !id.equals(parentDto.id) : parentDto.id != null) return false;
        if (lastName != null ? !lastName.equals(parentDto.lastName) : parentDto.lastName != null) return false;
        if (firstName != null ? !firstName.equals(parentDto.firstName) : parentDto.firstName != null) return false;
        if (patronymic != null ? !patronymic.equals(parentDto.patronymic) : parentDto.patronymic != null) return false;
        if (nickname != null ? !nickname.equals(parentDto.nickname) : parentDto.nickname != null) return false;
        if (email != null ? !email.equals(parentDto.email) : parentDto.email != null) return false;
        if (phone != null ? !phone.equals(parentDto.phone) : parentDto.phone != null) return false;
        return job != null ? job.equals(parentDto.job) : parentDto.job == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        return result;
    }

}
