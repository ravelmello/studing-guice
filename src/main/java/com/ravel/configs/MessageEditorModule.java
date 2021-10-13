package com.ravel.configs;

import com.google.inject.AbstractModule;
import com.ravel.interfaces.MessageChecker;
import com.ravel.interfaces.MessageCheckerImp;
import com.ravel.interfaces.WinWord;

public class MessageEditorModule extends AbstractModule {
    @Override
    protected void configure() {
      bind(MessageChecker.class).annotatedWith(WinWord.class).to(MessageCheckerImp.class);
    }
}
