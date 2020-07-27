package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public final static int SIZE = 10;
	private Member[] m =new Member[SIZE];
	
	public int existMemberNum() {
		return m.length;
	}
	public boolean checkId(String input) {
		boolean result = true;
		for(int i=0; i<m.length; ++i) {
			if(m[i].getId().equals(input)) {
				result = true;
			}else {
				result = false;
			}
		}
		return result;
	}
	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		int index;
		for(int i=0; i<m.length; ++i) {
			if(m[i] == null) {
				index = i;
				break;
			}
		}
		m[index] = new Member(id, name, password, email, gender, age);
	}
	public String searchId(String id) {
		
	}
	public Member[] searchName(String name) {
		
	}
	public Member[] searchEmail(String email) {
		
	}
	public boolean updatePassword(String id, String password) {
		
	}
	public boolean updateName(String id, String name) {
		
	}
	public boolean updateEmail(String id, String email) {
		
	}
	public boolean delete(String id) {
		
	}
	public void delete() {
		
	}
	public Member[] printAll() {
		
	}
}
