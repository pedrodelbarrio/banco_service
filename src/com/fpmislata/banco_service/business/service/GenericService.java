package com.fpmislata.banco_service.business.service;

import com.fpmislata.banco_service.core.BusinessException;
import java.util.List;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public interface GenericService<T> {

    T get(int id);

    T insert(T t) throws BusinessException;

    T update(T t);

    boolean delete(int id);

    List<T> findAll();

    T getDefault();

}
