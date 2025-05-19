package com.javaex.ex06;

public class MainApp {

	public static void main(String[] args) {
		// 인터페이스 변수 설정, 생략가능
		// Runnable dt = new DigitImpl();
		// Runnable ut = new UpperImpl();
		// Runnable lt = new LowerImpl();

		// 숫자출력
		Thread t01 = new Thread(new DigitImpl());
		t01.start();

		// 대문자 출력
		Thread t02 = new Thread(new UpperImpl());
		t02.start();

		// 소문자 출력
		Thread t03 = new Thread(new LowerImpl());
		t03.start();

	}

}
