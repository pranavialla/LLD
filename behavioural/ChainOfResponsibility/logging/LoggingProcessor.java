package behavioural.ChainOfResponsibility.logging;

import com.sun.jdi.LongType;

abstract  class  LoggingProcessor {
    private LoggingProcessor nextLogger;

    LoggingProcessor(LoggingProcessor nextLogger){
        this.nextLogger = nextLogger;
    }

    void log(LogType reqLogger, String message){
        if(nextLogger!= null){
            nextLogger.log(reqLogger,message);
        }
    }
}
