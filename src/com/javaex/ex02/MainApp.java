package com.javaex.ex02;

import java.util.Iterator;

public class MainApp {

	public static void main(String[] args) {
		// 숫자출력 → 출장 → Thread
		Thread dt = new DigitThread();
		dt.start(); // Thread 시작

		// 문자출력 → 메인

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			
			try {
				Thread.sleep(1000); // 1초대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
