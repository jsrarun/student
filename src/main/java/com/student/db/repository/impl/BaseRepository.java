package com.student.db.repository.impl;

import com.student.db.domain.TimeStampableModel;
import com.student.db.repository.Repository;
import com.student.rest.response.RestResponse;

import javax.annotation.PostConstruct;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseRepository<E extends TimeStampableModel, R extends RestResponse> implements Repository<E, R> {
  @PostConstruct
  public void init() {
    try {
      Type t = this.getClass().getGenericSuperclass();
      ParameterizedType pt = (ParameterizedType) t;
    } catch (Exception e) {
      //TODO
    }
  }

  @Override
  public R findById(String id) {
    return R;
  }

  @Override
  public List<R> findAll() {

    return new ArrayList<R>();
  }


  @Override
  public void delete(String id) {
  }

  @Override
  public E save(E e) {
    return e;
  }

  @Override
  public E update(E e) {
    return e;
  }

}
