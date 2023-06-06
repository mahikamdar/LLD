package com.mahi.chainingDPOrLogger;

public class DebugLogger extends Logger {

	public DebugLogger(Logger next) {
		super(next);
		
	}

	@Override
	public void log(int logLevel, String msg) {
		if(logLevel== DEBUG)
			System.out.println("debug : "+msg);
		else
		super.log(logLevel, msg);
	}

	
}
