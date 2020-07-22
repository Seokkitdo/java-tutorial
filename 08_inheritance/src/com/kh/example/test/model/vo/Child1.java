package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() {
		Parent p = new Parent();
//		p.num = 10;
		p.dNum = 0.0;
		p.bool = false; //protectedÀÇ 
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}

	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
