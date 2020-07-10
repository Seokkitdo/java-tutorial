package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	// while(조건식){
	//		실행문장;
	//		[증감식 or 분기문;]
	// }
	// 조건식 확인 -> (조건식 true 일 때) 실행문장 수행 -> 조건식 확인 -> (반복)
	public void method1() {
		// 1부터 5까지 출력
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	
	public void method1_1() {
		// 자기소개 5번하기 : 내 이름은 박신우야
		int i=0;
		while(i<5) {
			System.out.println("내 이름은 박신우야");
			i++;
		}
	}
	
	public void method2() {
		// 5부터  1까지 출력
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void method3() {
		// 1부터 10 사이의 홀수만 출력
		int i =1;
		while(i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
	}
	
	public void method4() {
		// 정수 두 개를 입력받아 그 사이 숫자 출력
		//사용자가 첫 번째 숫자를 더 크게 입력 해도 제대로 출력되게 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 : ");
		int start = sc.nextInt();
		
		System.out.print("정수 2 입력 : ");
		int end = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(end <= start) {
			max = start;
			min = end;
		} else {
			max = end;
			min = start;
		}
		while(min <= max) {
			System.out.print(min + " ");
			++min;
		}
		
	}
	
	public void method4_1() {
		// 정수 하나를 입력 받아 그 수가 1~9 사이의 수일때만 그 수의 구구단 출력
		// 조건이 맞지 않으면 1~9 사이의 양수를 입력하여야 합니다 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int dan = sc.nextInt();
		if(dan <= 0 || dan >=10) {
			System.out.println("1~9까지의 양수를 입력하여야 합니다");
		}else {
			int i = 1;
			while( i <= 9) {
				
				System.out.println(dan + " X " + i + "=" + dan * i);
				++i;
			}
		}
	}
	
	public void method5() {
		// 1부터 10 사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계
		int random = (int)(Math.random() * 10 + 1);
		int i = 1;
		int sum = 0;
		System.out.println("난수 입력 : " + random);
		while(i <= random) {
			sum += i;
			
			
			System.out.print(i);
			if(i < random) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
			++i;
		}System.out.println(sum);
	}
}
