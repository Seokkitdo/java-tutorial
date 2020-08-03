package com.kh.example.list.model.vo;

public class Student implements Comparable<Student>{
	
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return name + "(" + score + "점)";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// 객체 자체 비교
		if(this == obj) { //this 는 내 주소 obj는 매개변수로 받아온 주소
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		// 객체 필드 비교
		Student other = (Student)obj;
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name)) {
			return false;
		}
		if(score != other.score) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	// 
	@Override
	public int compareTo(Student o) {
		// 이름(String) 오름차순
//		String otherName = o.name;
//		int result = name.compareTo(otherName);
//				  	비교주체                    비교대상
//		비교 주체가 비교 대상과 같으면 0 반환
//		비교 주체가 비교 대상보다 크면 1반환
//		비교 주체가 비교 대상보다 작으면 -1반환
//		return result;
		return this.name.compareTo(o.name);
	}
	
	
}
