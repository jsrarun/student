package com.student.db.domain;

import javax.persistence.MappedSuperclass;

/**
 * @author Arun Kaushik
 */
@MappedSuperclass
public class TimeStampableModel extends DeleteableModel {
    private Long createdDate;
    private Long updatedDate;

    /**
     * Getter
     *
     * @return creadtedDate
     */
    public Long getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter
     *
     * @param createdDate : createdDate
     */
    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter
     *
     * @return : updatedDate
     */
    public Long getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Setter
     *
     * @param updatedDate : updatedDate
     */
    public void setUpdatedDate(Long updatedDate) {
        this.updatedDate = updatedDate;
    }
}
