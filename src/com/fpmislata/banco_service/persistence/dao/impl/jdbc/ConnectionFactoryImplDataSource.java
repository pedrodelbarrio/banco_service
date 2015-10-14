package com.fpmislata.banco_service.persistence.dao.impl.jdbc;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class ConnectionFactoryImplDataSource implements ConnectionFactory {

    @Override
    public Connection getConnection() {
        try {
            InitialContext initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            DataSource dataSource = (DataSource) envCtx.lookup("jdbc/banco");
            Connection connection = dataSource.getConnection();
            return connection;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
