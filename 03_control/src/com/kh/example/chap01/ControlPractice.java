package com.kh.example.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("입력 메뉴입니다");
			break;
		case 2:
			System.out.println("수정 메뉴입니다");
			break;
		case 3:
			System.out.println("조회 메뉴입니다");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
		break;
		default:
			System.out.println("1,2,3,4,7 중에 하나를 입력해주세요");
				
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if(num % 2 == 0 && num > 0) {
			System.out.println("짝수다");
			
		}else if (num % 2 == 1) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요");
		}
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kscore = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int mscore = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int escore = sc.nextInt();
		
		int total = kscore + mscore + escore;
		double average = total / 3;
		
		if(kscore >= 40 && mscore >= 40 && escore >= 40 && average >= 60) {
			System.out.println("국어 : " + kscore);
			System.out.println("수학 : " + mscore);
			System.out.println("영어 : " + escore);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 12사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 2: case 12:
			System.out.println(month + "월은 겨울입니다");
			break;
		
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다");
			break;
			
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을입니다");
			break;
			default:
				System.out.println(month + "월은 잘못 입력된 달입니다");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		String myId = "myId";
		String myPassword = "myPassword12";
		
		if(id.equals(myId) && password.equals(myPassword)) {
			System.out.println("로그인 성공");
		}else if(!id.equals(myId)){
			System.out.println("아이디가 틀렸습니다.");
		}else if(!password.equals(myPassword)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권환을 확인하고자 하는 등급 : ");
		String user = sc.next();
		
		if(user.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시클 조회");
		}else if(user.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else {
			System.out.println("게시글 조회");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight /(height * height);
		
		System.out.println("BMI 지수 : " + BMI);
		if(BMI >= 30) {
			System.out.println("고도 비만");
		} else if(BMI >= 25 ) {
			System.out.println("비만");
		}else if(BMI >= 23 ) {
			System.out.println("과체중");
		}else if(BMI >= 18.5 ) {
			System.out.println("정상체중");
		}else {
			System.out.println("저체중");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		double num1 = sc.nextDouble();
		System.out.print("피연산자 2 입력 : ");
		double num2 = sc.nextDouble();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.next().charAt(0);
		
		double result = 0;
		
		if(num1 > 0 && num2 > 0) {
			switch(op) {
			case '+':
				result = num1 + num2;
				
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
				
			}
			System.out.printf(num1 + " " + op +" "+ num2 + " = " + "%.6f",result);
		}else {
			System.out.println("양수를 입력해주세요.");
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double mtest = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		double ltest = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double ascore = sc.nextDouble();
		
		System.out.print("출석 회수 : ");
		double attend = sc.nextDouble();
		
		System.out.println("=============== 결 과 ===============");
		
		double mtotal = mtest * 0.2;
		double ltotal = ltest * 0.3;
		double atotal = ascore * 0.3;
		
		double alltotal = mtotal + ltotal + atotal + attend;
		
		
		
		if(alltotal >= 70 && attend >= 15) {
			System.out.println("중간 고사 점수(20) : " + mtest * 0.2);
			System.out.println("기말 고사 점수(30) : " + ltest * 0.3);
			System.out.println("과제 점수 (30) : " + ascore * 0.3);
			System.out.println("출석 점수 (20) : " + attend);
			System.out.println("총점 : " + alltotal);
			System.out.println("PASS");
		} else if(20-attend >= 6) {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]", (int)attend);
		}else if(alltotal < 70 ) {
			System.out.println("중간 고사 점수(20) : " + mtest * 0.2);
			System.out.println("기말 고사 점수(30) : " + ltest * 0.3);
			System.out.println("과제 점수 (30) : " + ascore * 0.3);
			System.out.println("출석 점수 (20) : " + attend);
			System.out.println("총점 : " + alltotal);
			System.out.print("Fail [점수 미달]");
		} 
	}
}
