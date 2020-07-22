package com.kh.example.test.model.vo;

public class Child2 extends Parent{
	private String str;

	public Child2() {
//		super.num = 10;
		super.dNum = 10;
		super.bool = false;
		super.ch = 'a';
	}
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
}
