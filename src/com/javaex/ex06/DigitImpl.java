package com.javaex.ex06;

public class DigitImpl implements Runnable {

	public void run() {
		for (int i = 1; i < 27; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
