package com.kh.variable;

public class D_Print {
	public void printlnExample() {
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ݰ����ϴ�");
		
		
	}

	public void printExample() {
		System.out.print("�ȳ��ϼ���");
		System.out.print("�ݰ����ϴ�");
//		System.out.println();
	}
	
	public void pirntfExample() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		
//		System.out.printf(format, args);
//		                              ������ ����
//		                                     �����Ϳ� �°� �� ����
		System.out.printf("%s. �ڽſ��Դϴ�. %s.\n", str1, str2);
		        //%s ���ڿ��� ��� ��
		System.out.printf("%s, ģ�ϰ� ������!", str2);
	
		System.out.println();
		
		//�̴� ����
		//�ȳ��ϼ���, ���� 20�� �ڽſ� �����Դϴ�. ������ �ݰ����ϴ�.
		int age = 20;
		String name = "�ڽſ�";
		String job = "����";
		
		System.out.printf("%s, ���� %d�� %s %s�Դϴ�. ������ %s.", str1, age, name,job,str2);
	}
}
