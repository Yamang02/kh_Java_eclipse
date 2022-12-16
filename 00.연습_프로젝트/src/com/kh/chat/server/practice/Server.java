package com.kh.chat.server.practice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
서버용 TCP 소켓 프로그래밍 순서

1. 서버의 포트 번호 정한다.
2. 서버용 소켓 객체를 생성한다.
3. 클라이언트에서 접속 요청이 올 때까지 기다린다.
4. 클라이언트로부터 접속 요청이 오면 요청 수락 후 해당 클라이언트와 연결된 소켓 객체 생성한다.
5. 연결된 클라이언트와 입출력 스트림 생성한다.
6. 보조 스트림을 통해 스트림의 성능을 개선한다.
7. 스트림을 통해 데이터를 읽고 쓴다.
8. 통신을 종료한다.

*/

public class Server {

	public void serverOpen() {

		int severPort = 30000;
		Socket clientSocket = null;
		ServerSocket servSocket = null;

		try {
			servSocket = new ServerSocket(severPort);
			System.out.println("서버 오픈");

			while (true) {
				System.out.println("client 접속 대기중...");
				servSocket.accept();

				System.out.println("client 연결됨!");

				Thread thread = new Thread(new Receiver(clientSocket));
				thread.start();

			}

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
