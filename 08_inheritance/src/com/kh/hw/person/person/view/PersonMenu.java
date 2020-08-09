package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	int[] arr = pc.personCount();
	public void mainMenu() {
		int menuNum;
		
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
			
			System.out.println();
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
			if(arr[0] == 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			}
			System.out.print("�޴� ��ȣ : ");
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
		System.out.print("�л� �̸� : ");
		String name = sc.nextLine();
		System.out.print("�л� ���� : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("�л� Ű : ");
		double height = Double.parseDouble(sc.nextLine());
		System.out.print("�л� ������ : ");
		double weight = Double.parseDouble(sc.nextLine());
		System.out.print("�л� �г� : ");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.print("�л� ���� : ");
		String major = sc.nextLine();
		System.out.println("����üũ��");
		pc.insertStudent(name, age, height, weight, grade, major);
		
		for(int i=0; i<arr[0]; ++i) {
			if(arr[0] != 3) {
				System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				char yn = sc.nextLine().toUpperCase().charAt(0);
				if(yn == 'N') {
					break;
				}
			}else if(arr[0] == 3){
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
				studentMenu();
			}
		}
		
	}
	
	public void printStudent(){ 
		System.out.println(pc.printStudent());
	}
	
	public void insertEmployee() {
		int[] arr = pc.personCount();
		System.out.print("��� �̸� : ");
		String name = sc.nextLine();
		System.out.print("��� ���� : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("��� Ű : ");
		double height = Double.parseDouble(sc.nextLine());
		System.out.println("��� ������ : ");
		double weight = Double.parseDouble(sc.nextLine());
		System.out.print("��� �޿� : ");
		int salary = Integer.parseInt(sc.nextLine());
		System.out.print("��� �μ� : ");
		String dept = sc.nextLine();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
		for(int i=0; i<arr[1]; ++i) {
			if(arr[0] != 3) {
				System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				char yn = sc.nextLine().toUpperCase().charAt(0);
				if(yn == 'N') {
					break;
				}
			}else if(arr[0] == 3){
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� ��� �޴��� ���ư��ϴ�.");
				employeeMenu();
			}
		}
	}
	
	public void printEmployee() {
		System.out.println(pc.printEmployee());
	}
}
