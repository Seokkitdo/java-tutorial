package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void gradeAverageTotal() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double korean = sc.nextDouble();
		
		System.out.print("���� : ");
		double english = sc.nextDouble();
		
		System.out.print("���� : ");
		double math = sc.nextDouble();
		
		int total = (int)korean + (int)english + (int)math;
		int average = total / 3;
		
		System.out.println("���� : "+total);
		System.out.println("��� : "+average);
	}
}
