package com.training.spring.security;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserObj {

    @Id
    private String username;
    private String password;
    private String role;


    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String passwordParam) {
        this.password = passwordParam;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(final String roleParam) {
        this.role = roleParam;
    }


}
