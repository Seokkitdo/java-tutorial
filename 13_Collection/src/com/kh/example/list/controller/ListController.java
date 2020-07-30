package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		
		List list1 = new ArrayList();
		list1.add(null);
		
		ArrayList<Student> list = new ArrayList<Student>(3);
		
		// add(E e) : 리스트 끝에 데이터 추가 
		list.add(new Student("테스트", 0));
		list.add(new Student("도대담", 60));
		
		System.out.println("list : " + list);
		
		
		
		list.add(new Student("남나눔", 90));
		list.add(new Student("하현호", 85));
		
		System.out.println("list : " + list);
		System.out.println("현재 list에 담긴 element 개수 : " + list.size()); //장점1. 크기에 제약이 없음
		
		list.add(new Student("문미미", 66));
		System.out.println("list : " + list);
		
		
		// 장점2. 추가/삭제/정렬 등의 기능처리 간단
		// add(int index, E e) : index번째에 추가
		list.add(0, new Student("류라라", 100));
		System.out.println("list : " + list); 
		list.add(3, new Student("강건강", 40));
		System.out.println("list : " +list);
		
		// remove(int index) : index번째 데이터 삭제
		list.remove(1);
		System.out.println("list : " + list);
		
		// remove(Object o) : 해당 데이터 삭제
		list.remove(new Student("강건강", 40)); //new 로 인해 새로운 주소를 가짐 remove는 주소를 통해서 삭제한다
		System.out.println("list : " + list);
		
		
		// 정렬 방법1. Collections 클래스 이용 : 컬렉션을 이용할 때 유용한 메소드를 모아놓은 클래스(자매품 : Arrays)
//		Collections.sort(list); // Student를 정렬할 기준을 세우지 않았기 때문에 오류
		Collections.sort(list); //이름순으로 정렬
		System.out.println("list 정렬1 : " + list);
		// 정렬 방법2. List.sort() 메소드 이용
		
		list.add(new Student("박보배", 85));
		list.sort(new StudentComparator());
		System.out.println("list 정렬2 : " + list);
		
		// 장점3. 여러타입을 저장할 수 있음
//		list.add("끝");
		
		//set(int index, E e) : index번째에 있는 요소를 e로 수정
		
		list.set(2, new Student("도대담", 60));
		System.out.println("list : " + list);
		
		// get(int index) : index번째에 있는 요소를 가지고 옴
		Student s = list.get(2);
		System.out.println(s);
		System.out.println("list : " + list);
		
		// subList(int index1, int index2) : index1번째부터 index2번째까지의 리스트 반환
		System.out.println(list.subList(2,5));
		
		// contains(Object o) : o가 리스트에 존재한다면 true 반환
		// indexOf(Object o ) : o가 리스트에 위치하는 인덱스 반환
		boolean bool = list.contains(new Student("남나눔", 90));
		System.out.println(bool);
		int index = list.indexOf(new Student("남나눔", 90));
		System.out.println(index);
		int index2 = list.indexOf(new Student("테스트", 0));
		System.out.println(index2);
		
		// clear() : 저장된 모든 객체 삭제
		// isEmpty() : 리스트가 비어있으면 true반환
		System.out.println("list : " + list);
		list.clear();
		System.out.println("list : " +list);
		System.out.println("list가 비어있나요? : " + list.isEmpty());
	}
}
