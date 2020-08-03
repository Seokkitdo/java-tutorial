package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		int menuNum;
		int[] arr = pc.personCount();
		System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� �л��� " + arr[0] + "�Դϴ�");
		System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� ����� " + arr[1] + "�Դϴ�");
		System.out.println();
		do {
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("�����մϴ�.");
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}while(menuNum != 9);
	}
	
	public void studentMenu() {
		int menuNum;
		do {
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				 insertStudent();
				 break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}while(menuNum != 9);
	}
	
	
	public void employeeMenu() {
		int menuNum;
		do {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				 insertEmployee();
				 break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}while(menuNum != 9);
	}
	
	
	public void insertStudent() {
		
	}
	
	public void printStudent(){ 
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
