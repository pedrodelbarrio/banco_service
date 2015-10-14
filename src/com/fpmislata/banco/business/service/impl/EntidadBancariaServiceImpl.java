package com.fpmislata.banco.business.service.impl;

import com.fpmislata.banco.business.domain.EntidadBancaria;
import com.fpmislata.banco.business.service.EntidadBancariaService;
import com.fpmislata.banco.persistence.dao.EntidadBancariaDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class EntidadBancariaServiceImpl implements EntidadBancariaService {

    @Autowired
    private EntidadBancariaDAO entidadBancariaDAO;

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
