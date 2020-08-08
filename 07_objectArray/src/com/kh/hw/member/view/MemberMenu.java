package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	public void mainMenu() {
		int menuNum;
		do {
			System.out.println("�ִ� ��� ������ ȸ�� ����" + (10-mc.existMemberNum()) + "���Դϴ�");
			System.out.println("���� ��ϵ� ȸ�� ����" + mc.existMemberNum() +"���Դϴ�");
			System.out.println("1. �� ȸ�� ���");
			System.out.println("2, ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			
			switch(menuNum) {
			case 1:
				System.out.println("�� ȸ���� ����մϴ�.");
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
			}
		}while(menuNum != 9);
	}
	
	public void insertMember() {
		System.out.print("���̵� : ");
		
		String id = sc.nextLine();
		while(mc.checkId(id) == false) {
			if(mc.checkId(id)) break;
			if(mc.checkId(id) == false) {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
				id = sc.nextLine();
				
			}
		}
		
		System.out.print("�̸�  : ");
		String name = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		System.out.print("�̸��� : ");
		String email = sc.nextLine();
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().toUpperCase().charAt(0);
		while(gender != 'M' || gender != 'F') {
			if(gender == 'M' || gender == 'F') {
				break;
			}
			System.out.println("������ �ٽ� �Է��ϼ���.");
			gender = sc.nextLine().toUpperCase().charAt(0);
			
		}
		System.out.print("���� : ");
		int age = Integer.parseInt(sc.nextLine());
		
		mc.insertMember(id, name, password, email, gender, age);
	}
	
	
	public void searchMember() {
		int menuNum;
		do {
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				searchId();
				break;
			case 2:
				searchName();
				break;
			case 3:
				searchEmail();
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�.");
				return;
			
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}while(menuNum != 9);
	}
	
	
	public void searchId() {
		System.out.print("�˻��� ���̵� : ");
		String id = sc.nextLine();
		System.out.println("ã���� ȸ�� �˻� ����Դϴ�." + mc.searchId(id));
		
	}
	
	public void searchName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		Member[] result = mc.searchName(name);
		for(int i=0; i<result.length; ++i) {
			if(result[i] != null) {
				System.out.println("ã���� ȸ�� �˻� ����Դϴ�." + result[i].inform());
			}
		}

		
	}
	
	public void searchEmail() {
		System.out.print("�˻��� �̸��� : ");
		String email = sc.nextLine();

		System.out.println("ã���� ȸ�� �˻� ����Դϴ�." + mc.searchEmail(email));
		
	}
	
	public void updateMember() {
		int menuNum;
		do {
			System.out.println("1. ��й�ȣ �����ϱ�");
			System.out.println("2. �̸� �����ϱ�");
			System.out.println("3. �̸��� �����ϱ�");
			System.out.println("9. �������� ���ư���");
			
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				updatePassword();
				break;
			case 2:
				updateName();
				break;
			case 3:
				updateEmail();
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}while(menuNum != 9);
	}
	
	public void updatePassword() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		
		
		
		System.out.print("������ ��й�ȣ : ");
		String password = sc.nextLine();
		if(mc.updatePassword(id, password) == true) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
	}
	
	public void updateName() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("������ �̸� : ");
		String name = sc.nextLine();
		if(mc.updateName(id, name) == true) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
	}
	
	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ �̸��� : ");
		String email = sc.nextLine();
		if(mc.updateEmail(id, email) == true) {
			System.out.println("������ ���������� �Ǿ����ϴ�");
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
	}
	
	public void deleteMember() {
		int menuNum;
		do {
			System.out.println("1. Ư�� ȸ�� �����ϱ�");
			System.out.println("2. ��� ȸ�� �����ϱ�");
			System.out.println("9. �������� ���ư���");
			
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				deleteOne();
				break;
			case 2:
				deleteAll();
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		}while(menuNum != 9);
	}
	
	public void deleteOne() {
		System.out.print("������ id�� �Է����ּ��� : ");
		String id = sc.nextLine();
		System.out.print("���� �����Ͻðڽ��ϱ�? (y/n)");
		char yn = sc.nextLine().toUpperCase().charAt(0);
		if(yn == 'Y') {
			mc.delete(id);
			System.out.println("���������� �����Ͽ����ϴ�.");
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
	}
	
	public void deleteAll() {
		
	}
}
