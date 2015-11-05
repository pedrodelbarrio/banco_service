package com.fpmislata.banco_service.persistence.dao.impl.jdbc;

import com.fpmislata.banco_service.persistence.jdbc.DataSourceFactory;
import java.sql.Connection;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class ConnectionFactoryImplDataSource implements ConnectionFactory {

    @Autowired
    DataSourceFactory dataSourceFactory;

    @Override
    public Connection getConnection() {
        try {
            DataSource dataSource = dataSourceFactory.getDataSource();
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
