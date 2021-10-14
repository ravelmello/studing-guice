package com.ravel.providers;

import com.google.inject.Provider;
import com.ravel.entities.Connection;

public class ConnectionProvider implements Provider<Connection> {
    @Override
    public Connection get() {
            String dbUrl = "jdbc:mysql://localhost:5432/tazy";
            String user = "ravel";
            Integer timeOut = 10;
            return new Connection(dbUrl, user, timeOut);
    }
}
