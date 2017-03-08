package com.sdajava.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by lukas on 27.02.2017.
 */
public class InfoLogger {

    private static final Logger LOGGER = Logger.getLogger(InfoLogger.class.getName());

    public InfoLogger() throws IOException {
        FileHandler fileHandler = new FileHandler("logg.log");
        LOGGER.addHandler(fileHandler);
        LOGGER.fine( "do constructor");

    }

    public void run(){
        LOGGER.fine( "do run method");
    }

    public void execute(){

    }

    public void exit(){

    }



}
