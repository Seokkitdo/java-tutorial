package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = num > 0  ? "����Դϴ�" : "����� �ƴϴ�";
		System.out.println(result);
	}
	
	public void practice2() {
		Scanner sc  = new Scanner(System.in);
		System.out.print("����  : ");
		
		int num = sc.nextInt();
		String result = num > 0 ? "����Դϴ�" : (num < 0 ? "�����Դϴ�" : "0�Դϴ�");
		
		System.out.println(result);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
		System.out.println(result);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
		int pNum = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int cNum = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + cNum / pNum);
		System.out.println("���� ���� ���� : " + (cNum - (pNum * (cNum / pNum))));
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int classNumber = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("����(�Ҽ��� �Ʒ� ��¥�ڸ�����) : ");
		double score = sc.nextDouble();
		
		System.out.print(grade + "�г� " + classNumber + "�� " + number + "�� "
				+ name + " ���л��� ������ " + score + "�̴�.");
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		String result = age > 19 ? "����" : (age > 13 && age <=19) ? "û�ҳ�" : " ���";
		System.out.print(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kscore = sc.nextInt();
		
		System.out.print("���� : ");
		int escore = sc.nextInt();
		
		System.out.print("���� : ");
		int mscore = sc.nextInt();
		
		int total = kscore + escore + mscore;
		double average = (kscore + escore + mscore) / 3;
		
		System.out.println("�հ� : " + total);
		System.out.println("��� : " + average);
		
		String pass = kscore >= 40 && escore >= 40 && mscore >= 40 && average >= 60 ? "�հ�" : "���հ�";
		System.out.print(pass);
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		String number = sc.nextLine();
		
		String result = number.charAt(7) == '1' ? "����" : "����";
		System.out.println(result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		
		String result = num3 <= num1 || num3 >= num2 ? "true" : "false";
		System.out.println(result);
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2) && (num2 ==num3) && (num3 == num1) ? "true" : "false";
		System.out.print(result);
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int aSalary = sc.nextInt();
		double atotal = aSalary + (aSalary*0.4);
		
		System.out.print("B����� ���� : ");
		int bSalary = sc.nextInt();
		
		System.out.print("C����� ���� : ");
		int cSalary = sc.nextInt();
		double ctotal = cSalary + (cSalary*0.15);
		
		
		System.out.println("A��� ����/����+a : " + aSalary+"/"+atotal);
		String result1 = aSalary+aSalary*0.4 >= 3000 ? "3000 �̻�" : "3000 �̸�";
		System.out.println(result1);
		
		System.out.println("B��� ����/����+a : " + bSalary+"/"+(double)bSalary);
		String result2 = bSalary >= 3000 ? "3000 �̻�" : "3000 �̸�";
		System.out.println(result2);
		

		System.out.printf("C��� ����/����+a : " + cSalary+ "/" + "%.13f", ctotal);

		String result3 = cSalary+cSalary*0.15 >= 3000 ? "3000 �̻�" : "3000 �̸�";
		System.out.println(result3);
	}
}
