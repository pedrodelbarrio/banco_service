package com.fpmislata.banco_service.security;

import com.fpmislata.banco_service.business.domain.Usuario;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public interface Authorization {

    boolean isAuthorizedURL(Usuario usuario, String url, String metodo);
}
