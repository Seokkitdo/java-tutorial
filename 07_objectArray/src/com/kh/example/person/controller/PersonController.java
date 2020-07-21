package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		// 객체 배열은 객체에 대한 배열
		// Person객체가 들어갈 수 있는 5개의 공간 pArr을 생성
		Person parr[] = new Person[5];
		
		for(int i =0; i<parr.length; ++i) {
			System.out.print(parr[i] + " ");
		}
		System.out.println();
		
		// 인덱스를 이용한 초기화
		parr[0] = new Person("강건강", 25, '남', 179.5, 75.6);
		parr[1] = new Person("남나눔", 13,'남',215.9,3512.9);
		parr[2] = new Person("산토스", 21,'남',192.9,512.1);
		parr[3] = new Person("도룡뇽", 18,'남',133.9,12.3);
		parr[4] = new Person("도다리", 33,'남',162.9,32.2);
		
		for(int i =0; i<parr.length; ++i) {
			System.out.println(parr[i].personInfo());
		}
		System.out.println();
	}
	
	public void method2() {
		// 객체 배열도 할당과 동시에 초기화 가능
		int[] iarr = {1,2,3,4,};
		
		Person[] pArr = {new Person("박보배", 28, '여', 173.0, 50.2),
				new Person("남나눔", 13,'남',215.9,3512.9),
				new Person("산토스", 21,'남',192.9,512.1),
				new Person("도룡뇽", 18,'남',133.9,12.3),
				new Person("도다리", 33,'남',162.9,32.2)};
		
		for(int i =0; i<pArr.length; ++i) {
			System.out.println(pArr[i].personInfo());
		}
	}
}
