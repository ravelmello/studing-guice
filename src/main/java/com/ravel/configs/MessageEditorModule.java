package com.ravel.configs;

import com.google.inject.AbstractModule;
import com.ravel.interfaces.MessageChecker;
import com.ravel.interfaces.MessageCheckerImp;

public class MessageEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MessageChecker.class).to(MessageCheckerImp.class);
    }
}
