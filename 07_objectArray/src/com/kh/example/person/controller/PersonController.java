package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		// ��ü �迭�� ��ü�� ���� �迭
		// Person��ü�� �� �� �ִ� 5���� ���� pArr�� ����
		Person parr[] = new Person[5];
		
		for(int i =0; i<parr.length; ++i) {
			System.out.print(parr[i] + " ");
		}
		System.out.println();
		
		// �ε����� �̿��� �ʱ�ȭ
		parr[0] = new Person("���ǰ�", 25, '��', 179.5, 75.6);
		parr[1] = new Person("������", 13,'��',215.9,3512.9);
		parr[2] = new Person("���佺", 21,'��',192.9,512.1);
		parr[3] = new Person("���洨", 18,'��',133.9,12.3);
		parr[4] = new Person("���ٸ�", 33,'��',162.9,32.2);
		
		for(int i =0; i<parr.length; ++i) {
			System.out.println(parr[i].personInfo());
		}
		System.out.println();
	}
	
	public void method2() {
		// ��ü �迭�� �Ҵ�� ���ÿ� �ʱ�ȭ ����
		int[] iarr = {1,2,3,4,};
		
		Person[] pArr = {new Person("�ں���", 28, '��', 173.0, 50.2),
				new Person("������", 13,'��',215.9,3512.9),
				new Person("���佺", 21,'��',192.9,512.1),
				new Person("���洨", 18,'��',133.9,12.3),
				new Person("���ٸ�", 33,'��',162.9,32.2)};
		
		for(int i =0; i<pArr.length; ++i) {
			System.out.println(pArr[i].personInfo());
		}
	}
}
