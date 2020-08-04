package com.kh.example.chap02_tcp.part02_sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void startClient() {
		int port = 8600;
		try {
			
			BufferedReader br = null;
			PrintWriter pw = null;
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 1) ������ IP�ּҿ� ������ ���� ��Ʈ��ȣ�� �Ű������� �Ͽ� Ŭ���̾�Ʈ �� ���ϰ�ü ����
			Socket socket = new Socket(serverIP, port);
			if(socket !=null) { // �������� ������ ���������� ��
				
				
				
				// 2) �������� ����� ��Ʈ�� ����
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				
				
				
				// 3) ������Ʈ���� ���� ���� ����
				 br = new BufferedReader(new InputStreamReader(input));
				pw = new PrintWriter(output);
				
				Scanner sc = new Scanner(System.in);
				do {
					System.out.print("��ȭ �Է� : ");
					String message = sc.nextLine();
					
					// 4) ��Ʈ���� ���� �а� ����
					pw.println(message);
					pw.flush();
					
					if(message.equals("exit")) {
						break;
					}
					
					String serverMsg = br.readLine();
					System.out.println(serverMsg);
				}while(true);
				
				// Ŭ���̾�Ʈ�� -> ���� �޼��� ����
				
				// ���� -> Ŭ���̾�Ʈ �޼��� �б�
				
				// 5) ��� ����
				pw.close();
				pw.close();
				socket.close();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
