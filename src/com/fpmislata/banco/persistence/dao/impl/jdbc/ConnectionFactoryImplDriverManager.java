package com.fpmislata.banco.persistence.dao.impl.jdbc;

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
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Connection getConnection() {
        return this.connection;
    }

    @Override
    public void closeConnection(Connection connection) {
    }

}
