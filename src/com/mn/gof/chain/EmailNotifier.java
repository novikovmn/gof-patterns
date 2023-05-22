package com.mn.gof.chain;

public class EmailNotifier extends Notifier{

	public EmailNotifier(int priority) {
		super(priority);
	}

	@Override
	public void write(String message) {
		System.out.println("EmailNotifier: " + message);		
	}

}
