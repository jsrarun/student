package com.student.rest.controllers;

import com.student.db.domain.IdentityModel;
import com.student.db.repository.Repository;
import com.student.rest.request.CrudRequest;
import com.student.rest.response.RestResponse;
import com.student.service.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by Abhishek Samuel
 * Sr. Software Engineer
 * (Decipherzone Softwares LLP)
 */
public abstract class AbstractBaseCrudRestController<E extends IdentityModel, Q extends RestResponse, M extends CrudRequest<E>, S extends Service<E, Q, R>, R extends Repository<E, Q>>
  extends AbstractBaseRestController<E, Q, S, R> {

  @GetMapping(value = "/{id}")
  public Q findById(@PathVariable String id) {
    return this.service.findById(id);
  }

  @GetMapping
  public List<Q> findAll() {
    return this.service.findAll();
  }

  @PostMapping
  public E create(@RequestBody M model) {
    return this.service.save(model.convert());
  }

  @PutMapping
  public E update(@RequestBody M model) {
    return this.service.update(model.convert());
  }


  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable String id) {
    this.service.delete(id);
  }
}
