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
		
		
		System.out.println("===== 푸드코트에 오신 것을 환영합니다! =====");
		
		int menuNum = 0;
		do {
			System.out.println();
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 한식");
			System.out.println("2. 중식");
			System.out.println("3. 일식 ");
			System.out.println("4. 양식");
			System.out.println("5. 관리자메뉴");
			System.out.println("9. 종료");
			
			System.out.println();
			System.out.print("메뉴 번호 입력 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			System.out.println();
			switch(menuNum) {
			case 1: kmenuSelect(); break;
			case 2: cMenu(); break;
			case 3: jMenu(); break;
			case 4: wMenu(); break;
			case 5: oMenu(); break;
			case 9: System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}while(menuNum != 9);
	}
	
	public void kmenuSelect() {
		int menuNum;
		do {
			
			System.out.println("메뉴를 선택해주세요 : ");
			
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
				System.out.println("메뉴에 맞는 숫자를 입력해주세요.");
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
