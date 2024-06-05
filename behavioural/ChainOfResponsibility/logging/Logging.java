package behavioural.ChainOfResponsibility.logging;

import static behavioural.ChainOfResponsibility.logging.LogType.*;

public class Logging {
    public Logging(){
        LoggingProcessor loggingProcessor=new Info(new Debug((new Error(null))));

        loggingProcessor.log(INFO, "info log");
        loggingProcessor.log(DEBUG, "debug log");
        loggingProcessor.log(ERROR, "error log");
    }
}
