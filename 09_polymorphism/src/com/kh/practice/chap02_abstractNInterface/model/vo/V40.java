package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
	public V40() {}
	
	@Override
	public void setMaker(String maker) {
		// TODO Auto-generated method stub
		super.setMaker("LG");
	}
	public String makeCall() {
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}
	public String takeCall() {
		return "���� ��ư�� ����";
	}
	public String picture() {
		return "1200, 1600�� Ʈ���� ī�޶�";
	}
	public String charge() {
		return "��� ����, ��� ���� ����";
	}
	public String touch() {
		return "������";
	}
	public boolean bluetoothPen() {
		return false;
	}
	
	@Override
	public String printlnformation() {
		return super.getMaker() + makeCall();
	}
	
}
