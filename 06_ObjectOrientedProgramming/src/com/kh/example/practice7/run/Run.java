package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setNumber(100);
		e.setName("박신우");
		e.setDept("교육부");
		e.setJob("강사");
		e.setAge(20);
		e.setGender('F');
		e.setSalary(100);
		e.setbonusPoint(0.01);
		e.setPhone("010-1111-2222");
		e.setAddress("서울시 강남구 역삼동");
		
		System.out.println("사번 : " + e.getNumber());
		System.out.println("이름 : " + e.getName());
		System.out.println("부서 : " + e.getDept());
		System.out.println("직책 : " + e.getJob());
		System.out.println("나이 : " + e.getAge());
		System.out.println("성별 : " + e.getGender());
		System.out.println("급여 : " + e.getSalary());
		System.out.println("보너스율 : " + e.getbonusPoint());
		System.out.println("전화번호 : " + e.getPhone());
		System.out.println("주소 : " + e.getAddress());
		
	}

}
