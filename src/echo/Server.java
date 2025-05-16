package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

// 본사(천호동)
public class Server {

	public static void main(String[] args) throws IOException {
		// 서버 socket 생성
		ServerSocket serverSocket = new ServerSocket();
		
		/*  ip("192.168.0.28", 문자열), port(10001, 정수) Setting, ip는 계속 확인
			InetSocketAddress ipport = new InetSocketAddress("192.168.0.28", 10001);
			serverSocket.bind(ipport);
		*/

		// 한번만 사용하므로 바로 입력
		serverSocket.bind(new InetSocketAddress("192.168.0.28", 10001));

		// 서버시작
		System.out.println("<서버시작>");
		System.out.println("==================================");
		System.out.println("[연결을 기다리고 있습니다.]");

		// Client가 연결되면 accept()가 실행된다.

		// socket 생성(종이컵 전화기)
		Socket socket = serverSocket.accept();
		System.out.println("[Client가 연결되었습니다.]");

		// 메세지(읽기 stream)
		// 파일일때, InputStream in = FileInputStream("C:\\javaStudy\\MS949.txt");

		// 메인스트림, socket 안에 있는 빨대 연결
		InputStream in = socket.getInputStream();
		// 보조스트림
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		// 메세지(쓰기 stream)
		// 메인스트림
		OutputStream out = socket.getOutputStream();
		// 보조스트림
		OutputStreamWriter osw= new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		

		
		while(true) {
			String msg = br.readLine(); // 읽기실행
			if(msg == null) {
				break;
			}
			System.out.println("받은메세지: " + msg);
			
			// 메세지 보내기
			bw.write(msg); // 쓰기실행
			bw.newLine(); // 줄바꿈
			bw.flush(); // 메세지 강제전송
			
		}
		
		System.out.println("==================================");
		System.out.println("<서버 종료>");

		// 자원 정리
		bw.close();
		br.close();
		socket.close();
		serverSocket.close();
	}

}
