package com.ravel;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ravel.configs.MessageEditorModule;
import com.ravel.entities.MessageEditor;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MessageEditorModule());
        MessageEditor messageEditor = injector.getInstance(MessageEditor.class);
        messageEditor.makeChecker("Message Ok!");


    }
}
