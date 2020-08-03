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
		return name + "(" + score + "��)";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// ��ü ��ü ��
		if(this == obj) { //this �� �� �ּ� obj�� �Ű������� �޾ƿ� �ּ�
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		// ��ü �ʵ� ��
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
		// �̸�(String) ��������
//		String otherName = o.name;
//		int result = name.compareTo(otherName);
//				  	����ü                    �񱳴��
//		�� ��ü�� �� ���� ������ 0 ��ȯ
//		�� ��ü�� �� ��󺸴� ũ�� 1��ȯ
//		�� ��ü�� �� ��󺸴� ������ -1��ȯ
//		return result;
		return this.name.compareTo(o.name);
	}
	
	
}
