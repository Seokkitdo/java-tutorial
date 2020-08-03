package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {
	public static void main(String[] args) {
		try {
			InetAddress localIP = InetAddress.getLocalHost(); //static이 붙은 메소드를 이렇게 사용할 수 이따
			// 지역 호스트의 Host명과 IP주소 반환
			System.out.println("내 PC 명 : " + localIP.getHostName());
			System.out.println("내 IP : " + localIP.getHostAddress());
			
			InetAddress ieiIP = InetAddress.getByName("www.iei.or.kr"); //도메인 명을 통해 IP주소 얻음
			System.out.println("iei 서버 명 : " + ieiIP.getHostName());
			System.out.println("iei 서버 IP" + ieiIP.getHostAddress());
			
			InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
			System.out.println("구글 IP 개수 : " + googleIPs.length);
			
			for(InetAddress ip : googleIPs) {
				System.out.println(ip.getHostAddress());
			}
			
			InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 IP 개수 : " + naverIPs.length);
			
			for(InetAddress ip : naverIPs) {
				System.out.println(ip.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
