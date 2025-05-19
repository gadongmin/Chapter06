package com.javaex.ex05;

public class MainApp {
	public void main(String[] args) {
		// Runnable 만들기(1번만 사용 시에는 생략가능), 여러번 사용하면 만드는게 유리
		Runnable dt = new DigitThread(); // run 로직 포함

		// 숫자 출장
		Thread t = new Thread(new DigitThread()); // 파라미터를 dt로 입력가능
		t.start();

		// 대문자 메인
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
