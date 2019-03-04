package com.student.db.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * @author Arun Kaushik
 */
@Entity(name = "user")
public class User extends TimeStampableModel {

    @Column(name = "username")
    private String username;

    private String password;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;

    /**
     * Getter
     *
     * @return : username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter
     *
     * @param username : username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter
     *
     * @return : password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter
     *
     * @param password : password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter
     *
     * @return role
     */
    public Role getRole() {
        return role;
    }

    /**
     * Setter
     *
     * @param role : user role
     */
    public void setRole(Role role) {
        this.role = role;
    }

}
