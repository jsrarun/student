package com.student.service;


import com.student.db.domain.TimeStampableModel;
import com.student.rest.response.RestResponse;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author Arun Kaushik
 */
public interface Service<E extends TimeStampableModel, Q extends RestResponse, R extends Repository<E, Q>> extends Serializable {

    /**
     * Find by id
     *
     * @param id Primary key for entity
     * @return Reference of type E
     */
    Q findById(String id);

    /**
     * Get all non deleted records
     *
     * @return List of E
     */
    List<Q> findAll();

    /**
     * Delete by primary key
     *
     * @param id Primary key of E
     */
    void delete(String id);

    /**
     * Persist entity into DB
     *
     * @param e Entity<extends IdentityModel>
     */
    E save(E e);

    /**
     * Updates entity into DB
     *
     * @param e Entity<extends IdentityModel>
     */
    E update(E e);
}
