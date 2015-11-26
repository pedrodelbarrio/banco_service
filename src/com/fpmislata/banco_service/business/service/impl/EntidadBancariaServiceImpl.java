package com.fpmislata.banco_service.business.service.impl;

import com.fpmislata.banco_service.business.domain.EntidadBancaria;
import com.fpmislata.banco_service.business.service.EntidadBancariaService;
import com.fpmislata.banco_service.core.BusinessException;
import com.fpmislata.banco_service.core.BusinessMessage;
import com.fpmislata.banco_service.persistence.dao.EntidadBancariaDAO;
import java.util.ArrayList;
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
        return entidadBancariaDAO.get(id);
    }

    @Override
    public EntidadBancaria insert(EntidadBancaria entidadBancaria) throws BusinessException {

        List<BusinessMessage> businessMessages = new ArrayList<>();

        if (entidadBancaria.getCodigoEntidad() == null) {
            businessMessages.add(new BusinessMessage("El campo codigo no puede estar vacio", "Codigo"));
        }

        if (businessMessages.isEmpty()) {
            return entidadBancariaDAO.insert(entidadBancaria);
        } else {
            throw new BusinessException(businessMessages);
        }

    }

    @Override
    public EntidadBancaria update(EntidadBancaria entidadBancaria) {
        return entidadBancariaDAO.update(entidadBancaria);
    }

    @Override
    public boolean delete(int id) {
        return entidadBancariaDAO.delete(id);
    }

    @Override
    public List<EntidadBancaria> findAll() {
        return entidadBancariaDAO.findAll();
    }

    @Override
    public List<EntidadBancaria> findByNombre(String nombre) {
        return entidadBancariaDAO.findByNombre(nombre);
    }

    @Override
    public EntidadBancaria getDefault() {
        return new EntidadBancaria();
    }

}
