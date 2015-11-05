package com.fpmislata.banco_service.persistence.dao.impl.jdbc;

import java.sql.Connection;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public interface ConnectionFactory {

    Connection getConnection();

    void closeConnection(Connection connection);

}
