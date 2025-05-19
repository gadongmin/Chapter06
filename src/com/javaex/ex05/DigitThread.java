package com.javaex.ex05;
// 이미 상속받은게 있어서 Thread를 상속 받을수 없을때
// public class DigitThread Thread Shape 일때 인터페이스를 사용하여 기능추가 
public class DigitThread implements Runnable {

	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
