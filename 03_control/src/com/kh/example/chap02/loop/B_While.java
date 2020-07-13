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
				System.out.print(" + ");
			}else {
				System.out.print(" = ");
			}
			++i;
		}System.out.println(sum);
		
	}
	public void method6() {
		// 문자열을 입력 받아 인덱스 별로 문자 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("내가 입력한 문자열 : " + str);
		for(int i = 0; i < str.length(); i++) { // str.length() 반환값은 int이며 내가 입력한 문자열의 길이가 그 반환값이다. apple면 5가 반환됌.
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
		}
		
		int i = 0;
		while(i < str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}
	}
	
	public void method7() {
		// 2단ㄴ부터 9단까지 출력
		int i = 2;
		
		while(i <= 9) {
			int j = 1;
			while(j <= 9) {
				System.out.println(i + " X " + j + " = " + i * j);
				j++;
			}
			i++;
		}
	}
	
	public void method8() {
		// 아날로그 시계
		int i = 0;
		while( i <= 23) {
			int j = 0;
			while(j <= 59) {
				System.out.println(i + "시" + j + "분입니다");
				j++;
			}i++;
		}
	}
	
	public void method9() {
		
	}
	
	public void method10() {
		
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		while(menu != 9) {
			System.out.println("1. 1~5출력");
			System.out.println("2. 5~1출력");
			System.out.println("3. 1~10사이 홀수 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴번호 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("종료합니다.");
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
//		while(true) { //무한 반복문
//
//			System.out.println("1. 1~5 출력");
//			System.out.println("2. 5~1 출력");
//			System.out.println("3. 1~10 중 홀수만 출력");
//			System.out.println("9. 종료");
//			System.out.print("메뉴 선택 : ");
//			int menu = sc.nextInt();
//			
//			switch(menu) {
//			case 1: method1(); break;
//			case 2: method2(); break;
//			case 3: method3(); break;
//			case 9: System.out.println("종료합니다"); return; //나를 불러준 메소드로 되돌아간다 여기서는 run에 있는 main 메소드
//			default : System.out.println("잘못 입력하셨습니다.");
//			}
//		}
//		System.out.println("ㅎ2");  이 코드가 에러가 나는 이유는 위에 while문이 무한 반복이기 때문에
		//위에 코드까지 도달할 수 가 없이 때문이다
		int menu = 0;
		do { //무한 반복문

			System.out.println("1. 1~5 출력");
			System.out.println("2. 5~1 출력");
			System.out.println("3. 1~10 중 홀수만 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("종료합니다"); return; //나를 불러준 메소드로 되돌아간다 여기서는 run에 있는 main 메소드
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}while(menu != 0);
	}
}
