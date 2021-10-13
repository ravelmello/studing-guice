package com.ravel.configs;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.ravel.entities.Connection;

public class ConnectionModule extends AbstractModule {
    @Override
    protected void configure(){
        throw new UnsupportedOperationException();
    }

    @Provides
    public Connection connectionProvider(){
        String dbUrl = "jdbc:mysql://localhost:5432/tazy";
        String user = "ravel";
        Integer timeOut = 10;
        return new Connection(dbUrl, user, timeOut);
    }
}
