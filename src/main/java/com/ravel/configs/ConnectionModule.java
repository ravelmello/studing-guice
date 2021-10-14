package com.ravel.configs;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.ravel.entities.Connection;
import com.ravel.providers.ConnectionProvider;

public class ConnectionModule extends AbstractModule {
    @Override
    protected void configure(){
       bind(Connection.class).toProvider(ConnectionProvider.class).in(Singleton.class);
    }
}
