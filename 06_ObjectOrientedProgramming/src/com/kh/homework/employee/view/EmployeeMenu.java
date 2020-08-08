package com.kh.homework.employee.view;

import java.util.Scanner;

import com.kh.homework.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		int menuNum;
		do {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ��� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ�� �������� : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: insertEmp(); break;
			case 2: updateEmp(); break;
			case 3: deleteEmp(); break;
			case 4: printEmp(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); break;
			default: System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while (menuNum != 9);
		
		
		
	}
	
	public void insertEmp() {
		
		char yn;
		do {
			System.out.print("��� ��ȣ : ");
			int empNo = sc.nextInt();
			sc.nextLine();
			System.out.print("��� �̸� : ");
			String name = sc.nextLine();
			System.out.print("��� ���� : ");
			char gender = sc.nextLine().charAt(0);
			System.out.print("��ȭ ��ȣ : ");
			String phone = sc.nextLine();
			System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�? (y/n)");
			yn = sc.nextLine().charAt(0);
			if(yn == 'n') {
				ec.add(empNo, name, gender, phone);
			} else if(yn == 'y') {
				System.out.print("��� �μ� : ");
				String dept = sc.nextLine();
				System.out.print("��� ���� : ");
				int salary = sc.nextInt();
				System.out.print("���ʽ� �� : ");
				double bonus = sc.nextDouble();
				ec.add(empNo, name, gender, phone, dept, salary, bonus);
			
			}
		}while(!(yn == 'n' || yn == 'y'));
	}
	
	public void updateEmp() {
		int menuNum = 0;
		do {
			System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�");
			System.out.println("����� � ������ �����Ͻðڽ��ϱ�?");
			System.out.println("1. ��ȭ ��ȣ");
			System.out.println("2. ��� ����");
			System.out.println("3. ���ʽ� ��");
			System.out.println("9. ���ư���");
			System.out.print("�޴� ��ȣ�� �������� : ");
			
			switch(menuNum) {
			case 1:
				System.out.print("������ ��ȭ��ȣ : ");
				String phone = sc.nextLine();
				ec.modify(phone);
				break;
			case 2:
				System.out.print("������ ���� : ");
				int salary = sc.nextInt();
				ec.modify(salary);
				break;
			case 3:
				System.out.print("������ ���ʽ��� : ");
				double bonus = sc.nextDouble();
				break;
			case 9:
				return;
			default :
				System.out.println("�ùٸ� ��ȣ�� �����ּ���");	
			}
		}while(menuNum != 9);
	}
	public void deleteEmp() {
		char yn;
			System.out.println("���� �����Ͻðڽ��ϱ�? (y/n)");
			sc.nextLine();
			yn = sc.nextLine().toUpperCase().charAt(0);
			if(yn == 'Y') {
				ec.remove();
				
			} 
		
	}
	
	public void printEmp() {
		String result = ec.toString();
		
		if(result == null) {
			System.out.println("�����ϴ� ��� �����Ͱ� �����ϴ�.");
		} else {
			System.out.println("���\t�̸�\t����\t�ڵ�����ȣ\t�μ�\t�޿�\t���ʽ�");
			
			System.out.println(result);
		}
	}
	
}
