package com.ravel.interfaces;

import java.util.logging.Logger;

public class WinWordCheckerImp extends MessageCheckerImp {

    private static final Logger LOGGER = Logger.getLogger(WinWordCheckerImp.class.getCanonicalName());

    @Override
    public void checkMessage(String message) {
       LOGGER.info("Inside the Checkspelling");
    }
}
