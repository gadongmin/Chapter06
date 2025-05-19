package com.javaex.ex02;

public class DigitThread extends Thread{
	// 필드
	// 생성자
	// 메소드 gs

	// 메소드 일반
	// 숫자출력 → 출장
	public void run() {
		for (int i = 1; i < 27; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000); // 1초대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
