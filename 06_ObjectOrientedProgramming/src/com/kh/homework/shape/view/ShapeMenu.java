package com.kh.homework.shape.view;

import java.util.Scanner;

import com.kh.homework.shape.controller.ShapeController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private ShapeController spr = new ShapeController();
	
	
	public void inputMenu() {
		int menuNum;
		do {
			System.out.println("===== 도형 프로그램 =====");
			menuNum = Integer.parseInt(sc.nextLine());
			
		} while (menuNum != 9 );
	}
	
	public void triangleMenu() {
		
	}
	
	public void squareMenu() {
		
	}
	
	public void inputData(int type, int menuNum) {
		
	}
	
	public void printlnform(int type) {
		
	}
}
