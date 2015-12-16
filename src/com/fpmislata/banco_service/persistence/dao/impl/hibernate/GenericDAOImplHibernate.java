package com.fpmislata.banco_service.persistence.dao.impl.hibernate;

import com.fpmislata.banco_service.persistence.dao.GenericDAO;
import java.util.List;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class GenericDAOImplHibernate<T> implements GenericDAO<T> {

    @Override
    public T get(int id) {
        
        /*http://cursohibernate.es/doku.php?id=unidades:07_arquitectura:03_dao*/
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T insert(T t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T update(T t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
