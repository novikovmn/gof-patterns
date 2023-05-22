package com.mn.gof.chain;

/*
 * if any questions: 
 * 		1) https://www.youtube.com/watch?v=66_0-u8P5DQ
 * 		2) https://habr.com/ru/articles/727454/		
 * 
 * */

public class Demo {

	public static void main(String[] args) {
		
		// три "уведомителя": обычный, почтовый, смс
		Notifier logToFileNotifier = new LogToFileNotifier(Priority.INFO);
		Notifier emailNotifier = new EmailNotifier(Priority.WARNING);
		Notifier smsNotifier = new SMSNotifier(Priority.DISASTER);
		
		// строим цепочку(т.е. сообщение будет передаваться от уведомителя к уведомителю и
		// при это конкретный уведомитель будет сначала анализировать приоритет, чтобы отправить его или)
		// цепочка: обычный -> почтовый -> смс
		logToFileNotifier.setNextNotifier(emailNotifier);
		emailNotifier.setNextNotifier(smsNotifier);
		
		// 1 кейс
		logToFileNotifier.notifyManager("System works fine)", Priority.INFO);
		System.out.println("==================");
		// 2 кейс
		logToFileNotifier.notifyManager("Need to pay for Internet!", Priority.WARNING);
		System.out.println("==================");
		// 3 кейс
		logToFileNotifier.notifyManager("Flooded the server room!!!!!", Priority.DISASTER);

	}

}
