package behavioural.ChainOfResponsibility.logging;

public class Error extends LoggingProcessor{


    Error(LoggingProcessor nextLogger) {
        super(nextLogger);
    }

    void log(LogType reqLogger, String message) {
        if(reqLogger.equals(LogType.ERROR)){
            System.out.println("info: " + message);
        }
        else {
            System.out.println("no log level");
        }
    }
}
