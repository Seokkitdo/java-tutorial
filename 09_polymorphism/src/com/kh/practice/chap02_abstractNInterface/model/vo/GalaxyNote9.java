package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {};
	@Override
	public void setMaker(String maker) {
		// TODO Auto-generated method stub
		super.setMaker("»ï¼º");
	}
	public String makeCall() {
		return "";
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
