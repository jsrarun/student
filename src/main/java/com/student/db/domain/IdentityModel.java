package com.student.db.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Arun Kaushik
 */
@MappedSuperclass
public class IdentityModel extends TimeStampableModel {
    @Id
    @Column(name = "id")
    private String id;

    /**
     * Getter
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter
     *
     * @param id : id
     */
    public void setId(String id) {
        this.id = id;
    }
}
