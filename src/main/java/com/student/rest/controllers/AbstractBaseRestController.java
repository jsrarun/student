package com.student.rest.controllers;

import com.student.db.domain.IdentityModel;
import com.student.db.repository.Repository;
import com.student.rest.response.RestResponse;
import com.student.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @param <E> Identity Model
 * @param <Q> Rest Response
 * @param <S> Service
 * @param <R> Repository
 */
public abstract class AbstractBaseRestController<
        E extends IdentityModel,
        Q extends RestResponse,
        S extends Service<E, Q, R>,
        R extends Repository<E, Q>> implements RestController<E, Q, S, R> {

    @Autowired
    protected S service;

}
