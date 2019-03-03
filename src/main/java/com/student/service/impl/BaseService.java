package com.student.service.impl;

import com.student.db.domain.TimeStampableModel;
import com.student.db.repository.Repository;
import com.student.rest.response.RestResponse;
import com.student.service.Service;

/**
 * @author Arun Kaushik
 */
public abstract class BaseService<E extends TimeStampableModel, Q extends RestResponse, R extends Repository<E, Q>> implements Service<E, Q, R> {

  protected R repository;

  public BaseService(R repository) {
    this.repository = repository;
  }

  @Override
  public Q findById(String id) {
    return this.repository.findById(id);
  }


  @Override
  public void delete(String id) {
    this.repository.delete(id);
  }

  @Override
  public E save(E e) {
    return this.repository.save(e);
  }

  @Override
  public E update(E e) {
    return this.repository.update(e);
  }
}
