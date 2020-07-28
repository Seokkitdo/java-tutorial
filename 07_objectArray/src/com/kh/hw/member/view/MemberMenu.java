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
			System.out.println("�ִ� ��� ������ ȸ�� ���� " + mc.SIZE + "���Դϴ�");
			System.out.println("���� ��ϵ� ȸ�� ���� " + mc.existMemberNum() +"���Դϴ�");
			
			if(mc.existMemberNum() != 10) {
				System.out.println("1. �� ȸ�� ���");
				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ����");
				System.out.println("5. ��� ���");
				System.out.println("9. ������");
				System.out.println("�޴� ��ȣ : ");
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
					System.out.println("���α׷��� �����մϴ�.");
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					break;
				}
			}else {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�");
				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("ȸ�� ����");
				System.out.println("��� ���");
				System.out.println("9. ������");
				System.out.println("�޴� ��ȣ : ");
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 2: searchMember(); break;
				case 3: updateMember(); break;
				case 4: deleteMember(); break;
				case 5: printAll(); break;
				case 9: System.out.println("���α׷��� �����մϴ�."); break;
				default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
			
			} 
		}while (menuNum != 9);
	}	
	public void insertMember() {
		System.out.println("�� ȸ���� ����մϴ�.");
		boolean check = false;
		String id = null;
		do {
			System.out.print("���̵� : ");
			String inputId = sc.next();
			check = mc.checkId(inputId);
			if (check) {
				id = inputId;
			}else {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է��ϼ���.");
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
