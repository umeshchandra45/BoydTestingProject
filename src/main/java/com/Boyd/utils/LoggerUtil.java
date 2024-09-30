package com.Boyd.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.appender.FileAppender;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerUtil {
    public  void setDynamicLogFile(Class<?> clazz) {
        // Get the current class name
        String className = clazz.getSimpleName();

        // Get current date and time, ensuring we avoid invalid Windows filename characters
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = sdf.format(new Date());

        // Define the log file name dynamically
        String logFileName = className + "_" + timestamp + ".log";
        
        // Ensure the logs directory exists
        File logDir = new File("logs/");
        if (!logDir.exists()) {
            logDir.mkdirs();  // Create the logs directory if it doesn't exist
        }

        // Check if the directory is created successfully
        if (!logDir.isDirectory()) {
            throw new RuntimeException("Failed to create logs directory: " + logDir.getAbsolutePath());
        }

        // Ensure that the path to the log file is valid and not causing issues
        String logFilePath = new File(logDir, logFileName).getAbsolutePath();

        // Print the log file path to debug any potential issues
        System.out.println("Log file path: " + logFilePath);

        // Get the LoggerContext and Configuration
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        Configuration config = context.getConfiguration();

        // Define the layout for the log file
        PatternLayout layout = PatternLayout.newBuilder()
                .withPattern("%d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %logger{36} - %msg%n")
                .build();

        // Create a new FileAppender with a dynamic log file path
        FileAppender fileAppender = FileAppender.newBuilder()
                .setName("dynamicFileAppender")
                .withFileName(logFilePath)  // Log file path is set correctly
                .setLayout(layout)
                .setConfiguration(config)
                .build();

        // Start the appender
        fileAppender.start();

        // Add the appender to the configuration
        config.addAppender(fileAppender);
        config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME).addAppender(fileAppender, null, null);

        // Update loggers
        context.updateLoggers();
    }

    public Logger getLogger(Class<?> clazz) {
        return LogManager.getLogger(clazz);
    }
}
