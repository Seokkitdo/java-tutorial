package com.kh.example.practice1.model.vo;

public class Member {
	private String memberId;
	private String momberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member( ) {} //생성자 만들기
	
	public void changeName(String name) {
		this.memberName = name;
	}
	
	public void printName() {
		System.out.println(memberName);
	}
}
