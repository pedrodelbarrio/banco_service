package com.fpmislata.banco_service.business.service;

import com.fpmislata.banco_service.business.domain.EntidadBancaria;
import java.util.List;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public interface EntidadBancariaService extends GenericService<EntidadBancaria> {

    List<EntidadBancaria> findByNombre(String nombre);

}
