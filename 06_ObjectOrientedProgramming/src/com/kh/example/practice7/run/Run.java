package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setNumber(100);
		e.setName("�ڽſ�");
		e.setDept("������");
		e.setJob("����");
		e.setAge(20);
		e.setGender('F');
		e.setSalary(100);
		e.setbonusPoint(0.01);
		e.setPhone("010-1111-2222");
		e.setAddress("����� ������ ���ﵿ");
		
		System.out.println("��� : " + e.getNumber());
		System.out.println("�̸� : " + e.getName());
		System.out.println("�μ� : " + e.getDept());
		System.out.println("��å : " + e.getJob());
		System.out.println("���� : " + e.getAge());
		System.out.println("���� : " + e.getGender());
		System.out.println("�޿� : " + e.getSalary());
		System.out.println("���ʽ��� : " + e.getbonusPoint());
		System.out.println("��ȭ��ȣ : " + e.getPhone());
		System.out.println("�ּ� : " + e.getAddress());
		
	}

}
