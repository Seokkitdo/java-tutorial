package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	int[] arr = pc.personCount();
	public void mainMenu() {
		int menuNum;
		
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + arr[0] + "입니다");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 " + arr[1] + "입니다");
		System.out.println();
		do {
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			System.out.println();
			switch(menuNum) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}while(menuNum != 9);
	}
	
	public void studentMenu() {
		int menuNum;
		
		do {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			if(arr[0] == 3) {
				System.out.println("학샘을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				 insertStudent();
				 break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}while(menuNum != 9);
	}
	
	
	public void employeeMenu() {
		int menuNum;
		do {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				 insertEmployee();
				 break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}while(menuNum != 9);
	}
	
	
	public void insertStudent() {
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();
		System.out.print("학생 나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("학생 키 : ");
		double height = Double.parseDouble(sc.nextLine());
		System.out.print("학생 몸무게 : ");
		double weight = Double.parseDouble(sc.nextLine());
		System.out.print("학생 학년 : ");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.print("학생 전공 : ");
		String major = sc.nextLine();
		System.out.println("오류체크중");
		pc.insertStudent(name, age, height, weight, grade, major);
		
		for(int i=0; i<arr[0]; ++i) {
			if(arr[0] != 3) {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char yn = sc.nextLine().toUpperCase().charAt(0);
				if(yn == 'N') {
					break;
				}
			}else if(arr[0] == 3){
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 떄문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				studentMenu();
			}
		}
		
	}
	
	public void printStudent(){ 
		System.out.println(pc.printStudent());
	}
	
	public void insertEmployee() {
		int[] arr = pc.personCount();
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("사원 나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("사원 키 : ");
		double height = Double.parseDouble(sc.nextLine());
		System.out.println("사원 몸무게 : ");
		double weight = Double.parseDouble(sc.nextLine());
		System.out.print("사원 급여 : ");
		int salary = Integer.parseInt(sc.nextLine());
		System.out.print("사원 부서 : ");
		String dept = sc.nextLine();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
		for(int i=0; i<arr[1]; ++i) {
			if(arr[0] != 3) {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char yn = sc.nextLine().toUpperCase().charAt(0);
				if(yn == 'N') {
					break;
				}
			}else if(arr[0] == 3){
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 떄문에 학생 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				employeeMenu();
			}
		}
	}
	
	public void printEmployee() {
		System.out.println(pc.printEmployee());
	}
}
