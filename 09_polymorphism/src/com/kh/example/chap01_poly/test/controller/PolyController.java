package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {
	// 다형성
	//  	부모 레퍼런스 변수에 자식 객체가 담기는 것
	
	public void method() {
		// 1. 부모 타입 레퍼런스로 부모 객체를 다룰 때
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p = new Parent();
		//부모타입 레퍼런스     부모객체
		p.printParent();
		System.out.println();
		
		
		// 2. 자식 타입 레퍼런스로 자식 객체를 다룰 때
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		//      ㄴ자식타입레퍼런스   ㄴ자식 객체
		c1.printChild1();
		c1.printParent();
		System.out.println();
		
		// 3. 부모 타입 레퍼런스로 자식 객체를 다룰 때
		// 상속받으면 부모는 자식을 볼 수 없지만 자식은 부모를 볼 수 있다.
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우");
		Parent p2 = new Child2(); //다형성 적용
		
		//		ㄴ부모타입 레퍼런스  ㄴ자식객체
		// 자식객체가 부모에 담김 = 업캐스팅
		// :부모 타입의 참조형 변수가 모든 자식 객체를 받을 수 있는 것
		p2.printParent();
		
		((Child2)p2).printChild2();
		//형변환을 해줘야 child2를 쓸수이따
		
		
		System.out.println();
		
		
		
		// 4. 자식 타입 레퍼런스로 부모 객체를 다룰 때
		System.out.println("4. 자식타입 레퍼런스로 부모 객체를 다루는 경우");
//		Child2 c2 = new Parent();
		System.out.println();
		
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child2();
		pArr[3] = new Child1();
		
		for(int i=0; i<pArr.length; ++i) {
////			pArr[i].printParent();
//			if(pArr[i] instanceof Child1) {
//				((Child1)pArr[i]).printChild1();
//			} else if(pArr[i] instanceof Child2) {
//				((Child2)pArr[i]).printChild2();
//			}
			
			pArr[i].print();
		}
	
		
		
		
		
	}
}
