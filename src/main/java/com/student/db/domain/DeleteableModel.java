package com.student.db.domain;


import javax.persistence.MappedSuperclass;

/**
 * @author Arun Kaushik
 * {@link IdentityModel}
 */
@MappedSuperclass
public class DeleteableModel extends IdentityModel {

    private boolean isDeleted = Boolean.FALSE;

    /**
     * Getter
     *
     * @return : isDeleted
     */
    public boolean isDeleted() {
        return isDeleted;
    }

    /**
     * Setter
     *
     * @param isDeleted : isDeleted
     */
    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

}
