package com.kh.example.practice4.model.vo;

public class Student {
	// �ν��Ͻ� ������ Ŭ���� ������ ����
	// �ν��Ͻ� ���� : ��ü�� ������ ����� �� �ִ� ����(static�� ���� ����)
	// Ŭ���� ���� : ��ü�� ������ �ʰ� Ŭ������ �����Ͽ� ����� �� �ִ� ����(static�� ����)
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	// �ʱ�ȭ ���
	// �ν��Ͻ� ��� : ��ü�� ������ ������ �ʱ�ȭ
	{
		classroom = 3;
		name = "�ڽſ�";
		height = 160.1;
		gender = '��';
	}
	// Ŭ���� ��� : ���α׷� ���� �ÿ� �� �� �ʱ�ȭ
	static {
		grade = 2;
	}
	
	public Student() {}
	
	public void information() {
		System.out.println("grade : " + grade +  ", classroom : " + classroom  +  ", name : " + name  +  ", height : " + height + ", gender : "+ gender );
		
		
	}
}
