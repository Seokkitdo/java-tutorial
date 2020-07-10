package com.kh.example.chap01;

import java.util.Scanner;

public class ControlPractice {
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
