package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger logerInstance = null;
    private String lastLog = "";

    private Logger() {

    }

    public static Logger getInstance(){
        if(logerInstance==null){
            logerInstance = new Logger();
        }
        return logerInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
