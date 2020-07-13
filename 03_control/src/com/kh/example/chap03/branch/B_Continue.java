package com.kh.example.chap03.branch;

public class B_Continue {
	// 반복문 안에서만 사용 가능
	// continue문 아래의 내용을 실행하지 말고 다음 단계로 건너 뛰라는 의미
	
	public void method1() {
		// 1~100까지의 정수 합계 출력, 단 4의 배수는 빼고 계산
		
		int sum = 0;
		for(int i =0; i<= 100; ++i) {
			if(i % 4 == 0) {
				continue;
			}
			else {   //else 생략 가능
				sum += i;
			}
			
			System.out.print(i + " ");
			
		}System.out.println();
		System.out.println(sum);
	}
	
	public void method2() {
		// 짝수 단, 짝수 수는 뺀 구구단 출력
		for(int i = 2; i<=9; ++i) {
			for(int j = 1; j<=9; ++j) {
				if(j % 2 == 0 || i % 2 ==0) {
					continue;
				}
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
