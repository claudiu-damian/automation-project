package project.helpers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerHelper {
    public static final Logger logger = Logger.getLogger(LoggerHelper.class.getName());
    public void setLogger() throws IOException {
        LogManager.getLogManager().readConfiguration();
        Handler fileHandler = new FileHandler("%h/MyJavaLog.log");
        logger.addHandler(fileHandler);
        System.out.println(System.getProperty("java.util.logging.config.file"));
    }
}

