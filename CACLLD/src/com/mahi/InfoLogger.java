package com.mahi;

public class InfoLogger extends Logger {

	public InfoLogger(Logger next) {
		super(next);
		 
	}

	@Override
	public void log(int logLevel, String msg) {
		if(logLevel ==INFO)System.out.println("info : "+msg);
		else
		super.log(logLevel, msg);
	}

	
}
