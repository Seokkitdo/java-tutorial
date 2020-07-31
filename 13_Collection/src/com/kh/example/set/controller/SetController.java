package com.kh.example.set.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
//		HashSet<Dog> set = new HashSet<>(); // 뒤쪽 제네릭은 생략가능 -> 타입 추론이라고 함
		HashSet<Dog> set = new HashSet<Dog>(); // 웬만하면 명시해주자
		
		// add(E e) : set 안에 데이터 추가
		set.add(new Dog("마음", 3.3));
		set.add(new Dog("모모", 2.3));
		set.add(new Dog("이든", 5.6));
		
		set.add(new Dog("모모", 2.3)); //동등객체
//		System.out.println(set.toString()); //생략 가능
		System.out.println(set);
		
//		HashSet<String> s = new HashSet<String>();
//		s.add("예시1");
//		s.add("예시2");
//		s.add("예시3");
//		System.out.println(s); // equals로 오버라이딩
//		s.add("예시2");
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
		set2.add(new Dog("초고", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.0));
		set2.add(new Dog("초코", 2.1));
		System.out.println(set2);
		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.2));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));
		System.out.println(set2);
		
		
		TreeSet<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println(set3);
		
		
		TreeSet<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.addAll(set2);
//		set4.add(new Dog("봄이", 6.1)); //몸무게로만 비교를 하기 때문에 add를 써도 같은 객체로 인식하여 추가시키지 않는다
		set4.add(new Dog("봄이", 6.1)); //몸무게가 같은 경우에 이름까지 비교하는 코드 추가 o1.getName().compareTo(o2.getName());
		System.out.println(set4);
		
		
		
		
		
		
		//iterator set은 인덱스가 없기 때문에 for문을 사용할 수가 없으므로 대타로 iterator를 사용한다
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) { //iterator안에 다음값이 있으면 가져와라 = 다음값이 없을 때까지 출력
			System.out.println(it.next()); //다음값을 가져오는 메소드
			
		}
		// iterator는 끝에 돌아갔으면 재활용이 안된다. 다시 돌고 싶으면 새로 하나를 만들어야한다.
		while(it.hasNext()) { //iterator안에 다음값이 있으면 가져와라 = 다음값이 없을 때까지 출력
			System.out.println("re : " + it.next()); //다음값을 가져오는 메소드
			
		}
	}
}
