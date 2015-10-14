package com.fpmislata.banco_service.persistence.dao.impl.jdbc;

import java.sql.*;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class ConnectionFactoryImplDriverManager implements ConnectionFactory {

    private Connection connection;

    public ConnectionFactoryImplDriverManager() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    public void closeConnection(Connection connection) {
    }

}
