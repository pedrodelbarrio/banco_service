package com.fpmislata.banco_service.security.jasypt;

import com.fpmislata.banco_service.security.PasswordManager;
import org.jasypt.util.password.StrongPasswordEncryptor;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class PasswordManagerImplJasypt implements PasswordManager {

    private StrongPasswordEncryptor strongPasswordEncryptor = new StrongPasswordEncryptor();

    @Override
    public String encrypt(String plain) {
        return strongPasswordEncryptor.encryptPassword(plain);
    }

    @Override
    public boolean check(String plain, String encrypted) {
        if (strongPasswordEncryptor.checkPassword(plain, encrypted)) {
            return true;
        } else {
            return false;
        }
    }

}
