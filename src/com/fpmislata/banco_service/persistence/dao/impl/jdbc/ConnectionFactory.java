package com.fpmislata.banco_service.persistence.dao.impl.jdbc;

import java.sql.Connection;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public interface ConnectionFactory {

    public Connection getConnection();

    public void closeConnection(Connection connection);

}
