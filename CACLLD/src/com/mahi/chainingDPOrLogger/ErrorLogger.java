package com.mahi.chainingDPOrLogger;

public class ErrorLogger extends Logger {

	public ErrorLogger(Logger next) {
		super(next);
		
	}

	@Override
	public void log(int logLevel, String msg) {
		if(logLevel ==ERROR)
			System.out.println("Error : "+msg);
		else
		super.log(logLevel, msg);
	}

	
}
