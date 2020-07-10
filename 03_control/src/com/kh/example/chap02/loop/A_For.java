package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	// for(초기식; 조건식; 증감식){
	//		실행 문장;
	// }
	// 실행 순서 : 초기식 -> 조건식 확인 -> (조건식 true일 때) 실행문장 수행 -> 증감식 -> 조건식 확인 -> (반복)
	// 조건식의 결과가 false가 될 때까지 반복
	
	// for문 앞에 있는 초기식, 조건식 ,증감식 생략 가능
	// 초기식은 무엇인지, 조건은 무엇인지, 증감은 얼마나 되는지 소괄호 안은 아니어도 어딘가에는 표기해야 함
	// 결곡 for() 안에서만 생략될 뿐 모두 필요한 요소
	
	public void method1() {
		// 1부터 5까지 출력
		for(int i=0; i<=10; i++) {
			System.out.println(i + "번째 반복문 수행");
		}
	}
	
	public void method1_1() {
		// 자기소개 다섯번 하기 : 내 이름은 박신우야
		for(int i=0; i<5; i++) {
			System.out.println("내 이름은 박신우야");
		}
	}
	
	public void method2() {
		// 5부터 1까지 출력
		for(int i=5; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	public void method2_1() {
		// 8부터 3까지 출력
		for(int i=8; i>=3; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		// 1에서 10 사이의 홀수만 출력 
//		for(int i =1; i<=10; ++i) {
//			if(i % 2 == 1) {
//				System.out.print(i+" ");
//			}
//		}
		
		for(int i =1; i <= 10; i += 2) {  //증감식 바꾸기
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		// 정수 두 개를 입력 받아 그 사이 숫자 출력 
		
		// 정수 두 개를 입력하세요.
		// 단, 첫 번째 숫자를 두 번째 숫자보다 작게 입력해주세요
		// 첫 번째 숫자 : 5
		// 두 번째 숫자 : 8
		// 5 6 7 8
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요.");
		System.out.println("단, 첫 번째 숫자를 두 번째 숫자보다 작게 입력해주세요");
		System.out.print("첫 번째 숫자 : ");
//		int num1 = sc.nextInt();
		int start = sc.nextInt(); //start가 더 직관적이므로 start로 하는게 맞는 것 같다
		
		System.out.print("두 번재 숫자 : ");
//		int num2 = sc.nextInt();
		int end = sc.nextInt(); //end가 더 직관적이므로 end로 교체 
		// 코드를 짤 때 나 혼자만이 이해하는 것이 아닌 다른 사람이 봐도 이해할 수 있는 변수명을 사용하도록 노력하자.
		
//		for(int i = start; i <= end; i++) {
//			System.out.print(i + " ");
			
		int max = 0; //두 숫자 중 큰 숫자를 저장할 공간
		int min = 0; //두 숫자 중 작은 숫자를 저장할 공간
		
		if(start <= end) {
			max = end;
			min = start;
		} else {
			max = start;
			min = end;
		}
		
		for(; min <= max; min++) { //초기식을 생략할 수 있다. 두 번째 조건식과 세 번째 만으로도 해결 가능
			System.out.print(min + " ");
			System.out.println();
		}
	}
	
	public void method4_1() {
		//정수를 하나 입력 받아 그 수가 1~9 사이의 숫자일때만 그 수의 구구단 출력
		// 조건이 맞지 않으면 "1~9 사이의 양수를 입력해야합니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9사이의 양수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		if(num <=0 || num >=10) {
			System.out.println("1~9사이의 양수를 입력해야합니다");
		} else {
			for(int i = 1; i < 10; ++i) {
				System.out.println(num + " X " + i + " = " + num * i);
			}
		}
	}
	
	public void method5() {
		// 1부터 10 사이의 임의의 난수를 정해 1부터 난수까지의 합계 난수 : 임의의 숫자
		// 랜덤 값 생성 메소드 : Math.random()
		// o이상 1미만의 실수를 랜덤으로 반환(double)
//		System.out.println(Math.random()); 
		// (0단계)  0 <= Math.random() < 1 (실수)
		// (1단계)  0 <= Math.random() * 10 < 10			 : 0 ~ 9.999999999999999999
		// (2단계)  1 <= Math.random() * 10 + 1 < 11 		 : 1 ~ 10.99999999999
		// (3단계)  1 <= (int)(Math.random() * 10 + 1) < 11 : 1 ~ 10
		
		System.out.println("1부터 10 사이의 난수를 입력하세요");
		
		int random = (int)(Math.random() * 10 + 1);
		System.out.println("난수 : " + random);
		
		int sum = 0;
		for(int i = 1; i <= random; ++i) {
			sum += i;	
		}
		
		System.out.print("1부터 " + random + "까지의 합 : " + sum);
	}
	
	public void method6() {
		// 중첩 for문 : for문 안에 for문 사용 가능
		// 2단부터 9단까지 출력
		//2단출력 아래로   3단출력 아래로   4단출력 아래로
		for(int i =2; i<=9; i++) {
			System.out.println(" ");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}

		}
	}
	
	public void method7() {
		// 아날로그 시계 : 0시0분~ 23시 39분
		for(int i =0; i < 24; i++) {
			for(int j = 0; j<= 59; ++j) {
				System.out.print(i+"시 " + j + "분");
			}
		}
	}
	
	public void method8() {
		// 한 줄에 별 표(*) 가 5번 출력되는데 그 줄은 사용자가 입력한 수만큼 출력
		// 출력할 줄 수 : 3
		// *****
		// *****
		// *****
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수 : ");
		int input = sc.nextInt();
		for(int i = 0; i<input; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void method9() {
		// 한 줄에 별표 문자를 입력한 줄 수와 칸 수만큼 입력
		// 단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수 출력
		// 줄 수 : 4
		// 칸 수 : 5
		//	1****
		//	*2***
		//	**3**
		//	***4*
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수 : ");
		int zul = sc.nextInt();
		
		System.out.print("출력할 칸 수 : ");
		int kan = sc.nextInt();
		
		for(int i = 1; i <= zul; ++i) {
			for(int j = 1; j <= kan; ++j) {
				if(i == j) {
					System.out.printf("%d", i);
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
	}
}
