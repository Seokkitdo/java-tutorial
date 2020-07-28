package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	public void mainMenu() {
		int menuNum = 0;
		do {
			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() +"명입니다");
			
			if(mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.println("메뉴 번호 : ");
				menuNum = sc.nextInt();
				
				switch (menuNum) {
				case 1:
					insertMember();
					break;
				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
			}else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("회원 삭제");
				System.out.println("모두 출력");
				System.out.println("9. 끝내기");
				System.out.println("메뉴 번호 : ");
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 2: searchMember(); break;
				case 3: updateMember(); break;
				case 4: deleteMember(); break;
				case 5: printAll(); break;
				case 9: System.out.println("프로그램을 종료합니다."); break;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
			
			} 
		}while (menuNum != 9);
	}	
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		boolean check = false;
		String id = null;
		do {
			System.out.print("아이디 : ");
			String inputId = sc.next();
			check = mc.checkId(inputId);
			if (check) {
				id = inputId;
			}else {
				System.out.println("중복된 아이디입니다. 다시 입력하세요.");
			}
		} while (!check);
	}
	public void searchMember() {
		
	}
	public void searchId() {
		
	}
	public void searchName() {
		
	}
	public void serachEmail() {
		
	}
	public void updateMember() {
		
	}
	public void updatePassword() {
		
	}
	public void updateName() {
		
	}
	public void updateEmail() {
		
	}
	public void deleteMember() {
		
	}
	public void deleteOne() {
		
	}
	public void deleteAll() {
		
	}
	public void printAll() {
		
	}
}	
