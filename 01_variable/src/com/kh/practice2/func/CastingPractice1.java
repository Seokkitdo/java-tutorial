package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void inputCasting() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		char alpa = sc.nextLine().charAt(0);
		int ialpa = (int)alpa;
		
		System.out.print(alpa+" unicode : "+ialpa);
	}
}
