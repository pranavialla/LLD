package behavioural.ChainOfResponsibility.logging;

import static behavioural.ChainOfResponsibility.logging.LogType.INFO;

public class Info extends LoggingProcessor{

    Info(LoggingProcessor nextLogger) {
        super(nextLogger);
    }

    void log(LogType reqLogger, String message) {
        if(reqLogger.equals(INFO)){
            System.out.println("info: " + message);
        }
        else {
            super.log(reqLogger,message);
        }
    }
}
