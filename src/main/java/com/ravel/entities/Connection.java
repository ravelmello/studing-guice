package com.ravel.entities;

import com.google.inject.Inject;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection {

    private static final Logger LOGGER = Logger.getLogger(Connection.class.getCanonicalName());

    private String user;
    private Integer timeOut;
    private String dbUrl;

    @Inject
    public Connection(String dbUrl, String user, Integer timeOut) {
        this.dbUrl = dbUrl;
        this.user = user;
        this.timeOut = timeOut;
    }

    public void makeConnection(){
     LOGGER.log(Level.INFO, "Connection -> {0}", dbUrl);
     LOGGER.log(Level.INFO, "User -> {0}", user);
     LOGGER.log(Level.INFO, "timeOut in {0} -> ", timeOut);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
