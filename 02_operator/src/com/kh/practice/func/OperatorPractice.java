package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num > 0  ? "양수입니다" : "양수가 아니다";
		System.out.println(result);
	}
	
	public void practice2() {
		Scanner sc  = new Scanner(System.in);
		System.out.print("정수  : ");
		
		int num = sc.nextInt();
		String result = num > 0 ? "양수입니다" : (num < 0 ? "음수입니다" : "0입니다");
		
		System.out.println(result);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "짝수입니다" : "홀수입니다";
		System.out.println(result);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int pNum = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int cNum = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + cNum / pNum);
		System.out.println("남은 사탕 개수 : " + (cNum - (pNum * (cNum / pNum))));
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNumber = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘짜자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.print(grade + "학년 " + classNumber + "반 " + number + "번 "
				+ name + " 여학생의 성적은 " + score + "이다.");
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String result = age > 19 ? "성인" : (age > 13 && age <=19) ? "청소년" : " 어린이";
		System.out.print(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kscore = sc.nextInt();
		
		System.out.print("영어 : ");
		int escore = sc.nextInt();
		
		System.out.print("수학 : ");
		int mscore = sc.nextInt();
		
		int total = kscore + escore + mscore;
		double average = (kscore + escore + mscore) / 3;
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + average);
		
		String pass = kscore >= 40 && escore >= 40 && mscore >= 40 && average >= 60 ? "합격" : "불합격";
		System.out.print(pass);
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String number = sc.nextLine();
		
		String result = number.charAt(7) == '1' ? "남자" : "여자";
		System.out.println(result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		String result = num3 <= num1 || num3 >= num2 ? "true" : "false";
		System.out.println(result);
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2) && (num2 ==num3) && (num3 == num1) ? "true" : "false";
		System.out.print(result);
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int aSalary = sc.nextInt();
		double atotal = aSalary + (aSalary*0.4);
		
		System.out.print("B사원의 연봉 : ");
		int bSalary = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int cSalary = sc.nextInt();
		double ctotal = cSalary + (cSalary*0.15);
		
		
		System.out.println("A사원 연봉/연봉+a : " + aSalary+"/"+atotal);
		String result1 = aSalary+aSalary*0.4 >= 3000 ? "3000 이상" : "3000 미만";
		System.out.println(result1);
		
		System.out.println("B사원 연봉/연봉+a : " + bSalary+"/"+(double)bSalary);
		String result2 = bSalary >= 3000 ? "3000 이상" : "3000 미만";
		System.out.println(result2);
		

		System.out.printf("C사원 연봉/연봉+a : " + cSalary+ "/" + "%.13f", ctotal);

		String result3 = cSalary+cSalary*0.15 >= 3000 ? "3000 이상" : "3000 미만";
		System.out.println(result3);
	}
}
