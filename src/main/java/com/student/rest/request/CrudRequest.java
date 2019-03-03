package com.student.rest.request;


import com.student.db.domain.IdentityModel;

public interface CrudRequest<E extends IdentityModel> {
  E convert();
}
