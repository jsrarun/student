package com.student.db.repository.impl;

import com.student.db.domain.TimeStampableModel;
import com.student.db.repository.Repository;
import com.student.exception.DbOperationException;
import com.student.rest.response.RestResponse;
import org.joda.time.DateTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class BaseRepository<E extends TimeStampableModel, R extends RestResponse> implements Repository<E, R> {

    @PersistenceContext
    private EntityManager entityManager;
    private String entityName;

    /**
     * @param entityClass : entity Class
     */
    public BaseRepository(Class<E> entityClass) {
        this.entityName = entityClass.getName();
    }

    @Override
    public R findById(String id) {
        String hqlQuery = "FROM " + this.entityName + "WHERE tbl.isDeleted =:isDeleted AND tbl.id =:id";
        return (R)entityManager.createQuery(hqlQuery).setParameter("isDeleted", Boolean.FALSE).setParameter("id", id).getSingleResult();
    }

    @Override
    public List<R> findAll() {
        String hqlQuery = "FROM " + this.entityName + "WHERE tbl.isDeleted =:isDeleted";
        return (List<R>) entityManager.createQuery(hqlQuery).setParameter("isDeleted", Boolean.FALSE).getResultList();
    }

    @Override
    public void delete(String id) {

    }
    @Override
    public void save(E e) {
        try {
            if (e instanceof TimeStampableModel) {
                TimeStampableModel t = e;
                t.setCreatedDate(new DateTime().getMillis());
            }
            entityManager.persist(e);
            entityManager.flush();
        } catch (Exception ex) {
            throw new DbOperationException(ex.getMessage());
        }
    }

    @Override
    public E update(E e) {
        try {
            if (e instanceof TimeStampableModel) {
                TimeStampableModel t = e;
                t.setUpdatedDate(new DateTime().getMillis());
            }
            entityManager.merge(e);
            return e;
        } catch (Exception ex) {
            throw new DbOperationException(ex.getMessage());
        }
    }

}
