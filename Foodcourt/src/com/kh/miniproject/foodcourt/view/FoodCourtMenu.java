package com.kh.miniproject.foodcourt.view;

import java.util.Scanner;

import com.kh.miniproject.foodcourt.controller.FoodCourtController;

public class FoodCourtMenu {
	
	private Scanner sc = new Scanner(System.in);
	private FoodCourtController fcc = new FoodCourtController();
	public void mainMenu() {
		
		
		System.out.println("===== Ǫ����Ʈ�� ���� ���� ȯ���մϴ�! =====");
		
		int menuNum = 0;
		do {
			System.out.println();
			System.out.println("=====***** ���� �޴� *****=====");
			System.out.println("1. �ѽ�");
			System.out.println("2. �߽�");
			System.out.println("3. �Ͻ� ");
			System.out.println("4. ���");
			System.out.println("5. �����ڸ޴�");
			System.out.println("9. ����");
			
			System.out.println();
			System.out.print("�޴� ��ȣ �Է� : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: kMenu(); break;
			case 2: cMenu(); break;
			case 3: jMenu(); break;
			case 4: wMenu(); break;
			case 5: oMenu(); break;
			case 9: System.out.println("���α׷� ����"); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}while(menuNum != 9);
	}
	
	
	public void kMenu() {
//		fcc.PrintkFood();
	}
	public void cMenu() {
		
	}
	public void jMenu() {
		
	}
	public void wMenu() {
		
	}
	public void oMenu() {
		
	}
}
