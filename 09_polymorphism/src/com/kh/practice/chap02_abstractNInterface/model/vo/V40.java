package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
	public V40() {}
	public String makeCall() {
		return "";
	}
	@Override
	public void setMaker(String maker) {
		// TODO Auto-generated method stub
		super.setMaker("LG");
	}
	public String takeCall() {
		return "";
	}
	public String picture() {
		return "";
	}
	public String charge() {
		return "";
	}
	public String touch() {
		return "";
	}
	public boolean bluetoothPen() {
		return true;
	}
	
	@Override
	public String printlnformation() {
		return "";
	}
	
}
