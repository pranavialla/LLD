package behavioural.ChainOfResponsibility.logging;

public class Debug extends LoggingProcessor{
    Debug(LoggingProcessor nextLogger) {
        super(nextLogger);
    }

    void log(LogType reqLogger, String message) {
        if(reqLogger.equals(LogType.DEBUG)){
            System.out.println("info: " + message);
        }
        else {
            super.log(reqLogger, message);
        }
    }
}
