package com.mahi;

public class TestLogger {
public static void main(String[] args) {
	Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
	logger.log(Logger.INFO, "this is info message");
	logger.log(Logger.DEBUG, "this is debug message");
	logger.log(Logger.ERROR, "this is error message");
}
}
