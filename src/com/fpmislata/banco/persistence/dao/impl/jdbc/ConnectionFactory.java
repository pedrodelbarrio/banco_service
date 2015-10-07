package com.fpmislata.banco.persistence.dao.impl.jdbc;

import java.sql.Connection;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public interface ConnectionFactory {

    public Connection getConnection();

    public void closeConnection(Connection connection);

}
