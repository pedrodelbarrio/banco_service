package com.fpmislata.banco.persistence.dao;

import com.fpmislata.banco.business.domain.EntidadBancaria;
import java.util.List;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public interface EntidadBancariaDAO extends GenericDAO<EntidadBancaria> {

    List<EntidadBancaria> findByNombre(String nombre);

}
