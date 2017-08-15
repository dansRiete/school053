package com.school053.journal.model.security;

import javax.persistence.*;

@Entity
@Table(name = "authorities")
public class Authority {
    public enum AuthorityType {
        TEACHER, ADMIN, PARENT, CHILD
    }

    @Id
    @Column(name = "name", nullable = false, length = 36)
    @Enumerated(EnumType.STRING)
    private AuthorityType authority;

    @Column(name = "page", length = 36)
    private String defaultPage;

    public Authority(AuthorityType authority, String defaultPage) {
        this.authority = authority;
        this.defaultPage = defaultPage;
    }

    public Authority() {
    }

    public String getDefaultPage() {
        return defaultPage;
    }

    public void setDefaultPage(String defaultPage) {
        this.defaultPage = defaultPage;
    }

    public void setAuthority(AuthorityType authority) {
        this.authority = authority;
    }

}
