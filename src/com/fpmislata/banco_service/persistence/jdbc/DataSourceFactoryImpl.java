package com.fpmislata.banco_service.persistence.jdbc;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class DataSourceFactoryImpl implements DataSourceFactory {

    @Override
    public DataSource getDataSource() {
        try {
            InitialContext initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            DataSource dataSource = (DataSource) envCtx.lookup("jdbc/banco");
            initCtx.close();
            
            return dataSource;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
