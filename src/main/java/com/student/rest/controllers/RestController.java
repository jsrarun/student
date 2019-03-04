package com.student.rest.controllers;

import com.student.db.domain.IdentityModel;
import com.student.db.repository.Repository;
import com.student.rest.response.RestResponse;
import com.student.service.Service;

public interface RestController<
        E extends IdentityModel,
        Q extends RestResponse,
        S extends Service<E, Q, R>,
        R extends Repository<E, Q>> {


}
