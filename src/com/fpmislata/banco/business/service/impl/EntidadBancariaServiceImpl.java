package com.fpmislata.banco.business.service.impl;

import com.fpmislata.banco.business.domain.EntidadBancaria;
import com.fpmislata.banco.business.service.EntidadBancariaService;
import com.fpmislata.banco.persistence.dao.EntidadBancariaDAO;
import com.fpmislata.banco.persistence.dao.impl.jdbc.EntidadBancariaDAOImplJDBC;
import java.util.List;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class EntidadBancariaServiceImpl implements EntidadBancariaService {

    private final EntidadBancariaDAO entidadBancariaDAO;

    public EntidadBancariaServiceImpl() {
        this.entidadBancariaDAO = new EntidadBancariaDAOImplJDBC();
    }

    @Override
    public EntidadBancaria get(int id) {
        return this.entidadBancariaDAO.get(id);
    }

    @Override
    public EntidadBancaria insert(EntidadBancaria entidadBancaria) {
        return this.entidadBancariaDAO.insert(entidadBancaria);
    }

    @Override
    public EntidadBancaria update(EntidadBancaria entidadBancaria) {
        return this.entidadBancariaDAO.update(entidadBancaria);
    }

    @Override
    public boolean delete(int id) {
        return this.entidadBancariaDAO.delete(id);
    }

    @Override
    public List<EntidadBancaria> findAll() {
        return this.entidadBancariaDAO.findAll();
    }

    @Override
    public List<EntidadBancaria> findByNombre(String nombre) {
        return this.entidadBancariaDAO.findByNombre(nombre);
    }

}
