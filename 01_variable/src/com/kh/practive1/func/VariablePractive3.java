package com.kh.practive1.func;

import java.util.Scanner;

public class VariablePractive3 {
	public void squareCal() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double width = sc.nextDouble();
		
		System.out.print("���� : ");
		double height = sc.nextDouble();
		
		System.out.println("���� : " + width * height);
		System.out.println("�ѷ� : " + (width + height) * 2);
		
		
		
	}
}
