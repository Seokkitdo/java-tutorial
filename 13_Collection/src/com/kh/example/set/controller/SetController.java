package com.kh.example.set.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
//		HashSet<Dog> set = new HashSet<>(); // ���� ���׸��� �������� -> Ÿ�� �߷��̶�� ��
		HashSet<Dog> set = new HashSet<Dog>(); // �����ϸ� ���������
		
		// add(E e) : set �ȿ� ������ �߰�
		set.add(new Dog("����", 3.3));
		set.add(new Dog("���", 2.3));
		set.add(new Dog("�̵�", 5.6));
		
		set.add(new Dog("���", 2.3)); //���ü
//		System.out.println(set.toString()); //���� ����
		System.out.println(set);
		
//		HashSet<String> s = new HashSet<String>();
//		s.add("����1");
//		s.add("����2");
//		s.add("����3");
//		System.out.println(s); // equals�� �������̵�
//		s.add("����2");
//		System.out.println(s);
		
//		HashSet<Integer> s = new HashSet<Integer>();
//		s.add(1);
//		s.add(2);
//		s.add(3);
//		System.out.println(s);
//		
//		s.add(2);
//		System.out.println(s);
		
		
		LinkedHashSet<Dog> set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("�ʰ�", 2.1));
		set2.add(new Dog("����", 8.3));
		set2.add(new Dog("�κ�", 5.0));
		set2.add(new Dog("����", 2.1));
		System.out.println(set2);
		set2.add(new Dog("����", 6.1));
		set2.add(new Dog("����", 5.2));
		set2.add(new Dog("����", 9.5));
		set2.add(new Dog("����", 12.5));
		System.out.println(set2);
		
		
		TreeSet<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println(set3);
		
		
		TreeSet<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.addAll(set2);
//		set4.add(new Dog("����", 6.1)); //�����Էθ� �񱳸� �ϱ� ������ add�� �ᵵ ���� ��ü�� �ν��Ͽ� �߰���Ű�� �ʴ´�
		set4.add(new Dog("����", 6.1)); //�����԰� ���� ��쿡 �̸����� ���ϴ� �ڵ� �߰� o1.getName().compareTo(o2.getName());
		System.out.println(set4);
		
		
		
		
		
		
		//iterator set�� �ε����� ���� ������ for���� ����� ���� �����Ƿ� ��Ÿ�� iterator�� ����Ѵ�
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) { //iterator�ȿ� �������� ������ �����Ͷ� = �������� ���� ������ ���
			System.out.println(it.next()); //�������� �������� �޼ҵ�
			
		}
		// iterator�� ���� ���ư����� ��Ȱ���� �ȵȴ�. �ٽ� ���� ������ ���� �ϳ��� �������Ѵ�.
		while(it.hasNext()) { //iterator�ȿ� �������� ������ �����Ͷ� = �������� ���� ������ ���
			System.out.println("re : " + it.next()); //�������� �������� �޼ҵ�
			
		}
	}
}
