package com.kh.network.receivier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receiver implements Runnable {
	private Socket client;

	public Receiver(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {

		BufferedReader br = null;
		PrintWriter pw = null;

		try {

			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());

			while (true) {
				String message = br.readLine();

				if (message == null || message.equals("exit")) {
					System.out.println("클라이언트 접속 종료");

					break;
				}

				System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메시지: " + message);

				pw.println("메시지 수신 완료");
				pw.flush();

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 8. 통신을 종료한다.
			try {
				pw.close();
				client.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
