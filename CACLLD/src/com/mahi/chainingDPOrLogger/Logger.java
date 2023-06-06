package com.mahi.chainingDPOrLogger;

public abstract class Logger {
	Logger next;

	public static int INFO=1;
	public static int DEBUG=2;
	public static int ERROR=3;
	
	public Logger(Logger next) {
		this.next = next;
	}
	public  void  log(int logLevel,String msg) {
		if(next !=null)
			next.log(logLevel, msg);
	}
}
