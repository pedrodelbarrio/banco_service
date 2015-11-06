package com.fpmislata.banco_service.security;

import com.fpmislata.banco_service.business.domain.Usuario;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class AuthorizationImplDummy implements Authorization {

    @Override
    public boolean isAuthorizedURL(Usuario usuario, String url) {
        return true;
    }

}
