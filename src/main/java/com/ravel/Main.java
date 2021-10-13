package com.ravel;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ravel.configs.ConnectionModule;
import com.ravel.configs.MessageEditorModule;
import com.ravel.entities.Connection;
import com.ravel.entities.MessageEditor;



public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MessageEditorModule(), new ConnectionModule());
        MessageEditor messageEditor = injector.getInstance(MessageEditor.class);
        Connection conn = injector.getInstance(Connection.class);
        conn.makeConnection();
        messageEditor.makeChecker("Message Ok!");
    }
}
