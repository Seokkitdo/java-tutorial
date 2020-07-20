package com.kh.example.chap06_method.model.vo;

public class Trainee {
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private String time;
	private static double score;
	
	public Trainee() {};
	public Trainee(String name, char classRoom, String time, double score) {
		this.name = name;
		this.classRoom = classRoom;
		this.time = time;
		Trainee.score = score;
	}
	
	
//	public void changeName(String name) {
//		this.name = name;
//	}
	public void setName(String name) {
		this.name = name;
	}
//	public String printName() {
//		return this.name;
//	}
	public String getName() {
		return name;
	}
//	public String getACADEMY() {
//		return ACADEMY;
//	}
	public String getACADEMY() {
		return ACADEMY;
	}
//	public void setClassRoom(char classRoom) {
//		this.classRoom = classRoom;
//	}
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
//	public char showClassRoom() {
//		return classRoom;
//	}
	public char getClassRoom() {
		return classRoom;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public static void setScore(double score) {
		Trainee.score = score; //static을 가져올땐 class이름.변수이름 으로 가져온다
	}
	public static double getScore() {
		return score;
	}
	public String inform() {
		return ACADEMY + " " + name + " 훈련생은 " + classRoom + "반 " + time + "이고, "+ score + "점입니다";
	}
}
