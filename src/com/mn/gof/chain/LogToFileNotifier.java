package com.mn.gof.chain;

public class LogToFileNotifier extends Notifier {

	public LogToFileNotifier(int priority) {
		super(priority);
	}

	@Override
	public void write(String message) {
		System.out.println("LogToFileNotifier: " + message);
	}

}
