package com.ravel.entities;

import com.google.inject.Inject;
import com.ravel.interfaces.MessageChecker;
import com.ravel.interfaces.WinWord;

import java.util.logging.Logger;

public class MessageEditor {

    @Inject
    private Logger logger;

    private MessageChecker messageChecker;

    @Inject
    public MessageEditor(@WinWord MessageChecker messageChecker){
        this.messageChecker = messageChecker;
    }

    public void makeChecker(String message){
        logger.warning("ENTRANDO NO METODO MAKE CHECKER");
        messageChecker.checkMessage(message);
        logger.warning("SAINDO DO METODO MAKE CHECKER");
    }
}
