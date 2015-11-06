package com.fpmislata.banco_service.security;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public interface PasswordManager {

    String encrypt(String plain);

    String check(String plain, String encrypted);
}
