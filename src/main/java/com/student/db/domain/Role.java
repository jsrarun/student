package com.student.db.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Arun Kaushik
 */
@Entity(name = "role")
public class Role extends TimeStampableModel {
    private String name;

    @OneToMany(mappedBy = "role")
    private List<User> users = new ArrayList<User>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * Getter
     *
     * @return : name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name : name
     */
    public void setName(String name) {
        this.name = name;
    }
}
