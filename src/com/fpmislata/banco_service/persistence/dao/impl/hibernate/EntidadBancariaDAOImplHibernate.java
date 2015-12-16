package com.fpmislata.banco_service.persistence.dao.impl.hibernate;

import com.fpmislata.banco_service.business.domain.EntidadBancaria;
import com.fpmislata.banco_service.persistence.dao.EntidadBancariaDAO;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class EntidadBancariaDAOImplHibernate extends GenericDAOImplHibernate<EntidadBancaria> implements EntidadBancariaDAO {

    public EntidadBancaria get(int idEntidadBancaria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        EntidadBancaria entidadBancaria = (EntidadBancaria) session.get(EntidadBancaria.class, idEntidadBancaria);
        session.close();
        return entidadBancaria;
    }

    public EntidadBancaria insert(EntidadBancaria entidadBancaria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        EntidadBancaria entidadBancariaInsertada = (EntidadBancaria) session.save(entidadBancaria);
        session.close();
        return entidadBancariaInsertada;
    }

    public EntidadBancaria update(EntidadBancaria entidadBancaria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.update(entidadBancaria);
        session.close();
        return entidadBancaria;
    }

    public boolean delete(int idEntidadBancaria) {
        boolean resultado;
        Session session = HibernateUtil.getSessionFactory().openSession();
        EntidadBancaria entidadBancaria = this.get(idEntidadBancaria);
        if (entidadBancaria == null) {
            resultado = false;
        } else {

            session.delete(entidadBancaria);

            resultado = this.get(idEntidadBancaria) == null;

        }
        session.close();
        return resultado;
    }

    @Override
    public List<EntidadBancaria> findByNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
