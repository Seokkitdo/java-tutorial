package com.kh.miniproject.foodcourt.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.miniproject.foodcourt.controller.FoodCourtController;
import com.kh.miniproject.foodcourt.model.vo.FoodCourt;

public class FoodCourtMenu extends FoodCourtController{
	
	private Scanner sc = new Scanner(System.in);
	private FoodCourtController fcc = new FoodCourtController();
	ArrayList<FoodCourt> kselectList = new ArrayList<FoodCourt>();
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
			System.out.println();
			switch(menuNum) {
			case 1: kmenuSelect(); break;
			case 2: cMenu(); break;
			case 3: jMenu(); break;
			case 4: wMenu(); break;
			case 5: oMenu(); break;
			case 9: System.out.println("���α׷� ����"); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}while(menuNum != 9);
	}
	
	public void kmenuSelect() {
		int menuNum;
		do {
			
			System.out.println("�޴��� �������ּ��� : ");
			
			fcc.PrintkFood();
	
			menuNum = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			
			switch(menuNum) {
			case 1:
				foodList.get(0);
				break;
			case 2:
				foodList.get(1);
				break;
			case 3:
				foodList.get(2);
				break;
			case 4:
				foodList.get(3);
				break;
			case 5:
				
				return;
			default:
				System.out.println("�޴��� �´� ���ڸ� �Է����ּ���.");
			}
		}while(menuNum != 5);
	}
	
	
	
//	public void kMenu() {
//		fcc.PrintkFood();
//	}
	public void cMenu() {
		
	}
	public void jMenu() {
		
	}
	public void wMenu() {
		
	}
	public void oMenu() {
		
	}
}
