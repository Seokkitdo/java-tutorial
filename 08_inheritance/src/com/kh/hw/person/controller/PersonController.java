package com.kh.hw.person.controller;


import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] arr = new int[2];
	
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<s.length; ++i) {
			if(s[i] != null) {
				++count1;
			}
		}
		arr[0] = count1;
		
		for(int i=0; i<e.length; ++i) {
			if(e[i] != null) {
				++count2;
			}
		}
		arr[1] = count2;
		return arr;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i=0; i<s.length; ++i) {
			if(s[i] == null) {
				s[i].setName(name);
				s[i].setAge(age);
				s[i].setHeight(height);
				s[i].setWeight(weight);
				s[i].setGrade(grade);
				s[i].setMajor(major);
				break;
			} else if(s[s.length] != null){
				System.out.println("¸ñ·ÏÀÌ ²ËÃ¡½À´Ï´Ù.");
			}
		}
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i=0; i < e.length; ++i) {
			if(e[i] == null) {
				e[i].setName(name);
				e[i].setAge(age);
				e[i].setHeight(height);
				e[i].setWeight(weight);
				e[i].setSalary(salary);
				e[i].setDept(dept);
			}else if(e[e.length] != null){
				System.out.println("¸ñ·ÏÀÌ ²ËÃ¡½À´Ï´Ù");
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
	
}
