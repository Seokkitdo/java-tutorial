package com.kh.practive1.func;

import java.util.Scanner;

public class VariablePractive3 {
	public void squareCal() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + (width + height) * 2);
		
		
		
	}
}
