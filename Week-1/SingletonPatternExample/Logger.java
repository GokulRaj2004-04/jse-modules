package com.singleton;

public class Logger {
    private static Logger logger=null;

    private Logger() {
        System.out.println("Logger instance created");
    }

    public static Logger getInstance() {
        if (logger == null) {
        	logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
