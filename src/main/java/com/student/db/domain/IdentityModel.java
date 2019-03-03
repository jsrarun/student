package com.student.db.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Arun Kaushik
 */
@MappedSuperclass
public class IdentityModel extends TimeStampableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * Getter
     *
     * @return : id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter
     *
     * @param id : id
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
