package com.javaex.ex04;

import java.util.Iterator;

public class MainApp {
	public void main(String[] args) {

		Runnable dt = new DigitThread();
		dt.run();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
