package com.ravel.interfaces;

import com.google.inject.Inject;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MessageCheckerImp implements MessageChecker{

    @Inject
    private Logger logger;

    @Override
    public void checkMessage(String message) {
         if(!message.isEmpty()) {
             logger.log(Level.INFO, () -> "Inside the check, I receive this message " + message);
         } else {
             logger.log(Level.SEVERE, ()-> "Empty Message at Class -> " + getClass().getCanonicalName());
         }

    }
}
