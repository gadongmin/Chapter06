package com.javaex.ex03;

import java.util.Iterator;

public class DigitThread extends Thread {

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
