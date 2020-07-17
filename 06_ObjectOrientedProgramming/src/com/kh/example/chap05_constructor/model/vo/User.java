package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	private String userId;  
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	
	// �������� ��� ����
	//		1. ��ü ����
	//		2. �Ű������� ���޹��� ������ �ʵ� �ʱ�ȭ
	
	// ������ ��� �� ���� ����
	// 		1.�ݵ�� �̸���  Ŭ������ ����(��/�ҹ��� ����)
	//		2. ��ȯ���� �������� ����
	
	
	
	// �⺻ ������
	// 		�ƹ� �Ű� ������ ���� ������
	// 		JVM�� �⺻������ ��������
	// 		��, �Ű����� �ִ� �����ڸ� ����ٸ� �ڵ� ������ ���� ����
	// 		���� �ݵ�ġ ó���� ������ְ� ����
	public User() {}
	
	
	// �Ű����� �ִ� ������
	//		��ü ������ �ʵ� �ʱ�ȭ, �� ���� �������� ���
	//		���� �̸��� �����ڸ� ������� �ϴ� ��� �����ε� ���� �ǰ� ����� ���
	public User(String userId, String userPwd, String userName, Date enrollDate) {
//		userId = id; //�Ű������� �޾ƿ� ���� �ʵ忡 �־ �ʱ�ȭ ���Ѿ��Ѵ�
//		userPwd = pwd;
//		userName = name;
//		enrollDate = enroll;
//		//�Ű������� ���������� ���� �̸����� ����ϰ� �Ǹ� �������� ���������� �켱������ �� ���� ������
//		//������ �ν����� ���ϰ� ��� ���������� �����Ѵ�.
		
		
		
//		this.userId = userId;
//		this.userName = userName;
//		this.userPwd = userPwd;
		this(userId, userPwd, userName);
		this.enrollDate = enrollDate;
	}
	
	
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
		//�������̱� ������ �⺻���� null
	}
}
