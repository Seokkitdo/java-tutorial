package com.kh.practive1.func;

import java.util.Scanner;

public class VariablePractive1 {
	public void scannerInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String genderStr = sc.nextLine();
		char gender = genderStr.charAt(0);
		
		
		
	}
}
