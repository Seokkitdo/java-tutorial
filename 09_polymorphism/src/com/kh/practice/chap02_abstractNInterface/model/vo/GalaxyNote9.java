package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {};
	@Override
	public void setMaker(String maker) {
		// TODO Auto-generated method stub
		super.setMaker("�Ｚ");
	}
	public String makeCall() {
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}
	public String takeCall() {
		return "���� ��ư�� ����";
	}
	public String picture() {
		return "1200�� ��� ī�޶�";
	}
	public String charge() {
		return "��� ����, ��� ���� ����";
	}
	public String touch() {
		return "������, ������ ����";
	}
	public boolean bluetoothPen() {
		return true;
	}
	
	@Override
	public String printlnformation() {
		return super.getMaker() + makeCall();
	}
	
	
}
