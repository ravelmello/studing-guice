package com.ravel.interfaces;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MessageCheckerImp implements MessageChecker{

    private static final Logger LOGGER = Logger.getLogger(MessageCheckerImp.class.getCanonicalName());

    @Override
    public void checkMessage(String message) {
         if(!message.isEmpty()) {
             LOGGER.log(Level.INFO, () -> "Inside the check, I receive this message " + message);
         } else {
             LOGGER.log(Level.SEVERE, ()-> "Empty Message at Class -> " + getClass().getCanonicalName());
         }

    }
}
