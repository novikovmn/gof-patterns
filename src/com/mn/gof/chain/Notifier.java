package com.mn.gof.chain;

public abstract class Notifier {

	private int priority;

	private Notifier nextNotifier;

	public Notifier(int priority) {
		this.priority = priority;
	} 

	public Notifier getNextNotifier() {
		return nextNotifier;
	}

	public void setNextNotifier(Notifier nextNotifier) {
		this.nextNotifier = nextNotifier;
	}

	public abstract void write(String message);

	public void notifyManager(String message, int priority) {
		
		if (this.priority <= priority) { 
			write(message); 
		}
		
		if (this.nextNotifier != null) {
			this.nextNotifier.notifyManager(message, priority);
		}
	}

}
