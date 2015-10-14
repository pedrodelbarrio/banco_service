package com.fpmislata.banco_service.persistence.dao;

import com.fpmislata.banco_service.business.domain.EntidadBancaria;
import java.util.List;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public interface EntidadBancariaDAO extends GenericDAO<EntidadBancaria> {

    List<EntidadBancaria> findByNombre(String nombre);

}
