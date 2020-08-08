package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	public void mainMenu() {
		int menuNum;
		do {
			System.out.println("최대 등록 가능한 회원 수는" + (10-mc.existMemberNum()) + "명입니다");
			System.out.println("현재 등록된 회원 수는" + mc.existMemberNum() +"명입니다");
			System.out.println("1. 새 회원 등록");
			System.out.println("2, 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			
			switch(menuNum) {
			case 1:
				System.out.println("새 회원을 등록합니다.");
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			}
		}while(menuNum != 9);
	}
	
	public void insertMember() {
		System.out.print("아이디 : ");
		
		String id = sc.nextLine();
		while(mc.checkId(id) == false) {
			if(mc.checkId(id)) break;
			if(mc.checkId(id) == false) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				id = sc.nextLine();
				
			}
		}
		
		System.out.print("이름  : ");
		String name = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().toUpperCase().charAt(0);
		while(gender != 'M' || gender != 'F') {
			if(gender == 'M' || gender == 'F') {
				break;
			}
			System.out.println("성별을 다시 입력하세요.");
			gender = sc.nextLine().toUpperCase().charAt(0);
			
		}
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		mc.insertMember(id, name, password, email, gender, age);
	}
	
	
	public void searchMember() {
		int menuNum;
		do {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				searchId();
				break;
			case 2:
				searchName();
				break;
			case 3:
				searchEmail();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}while(menuNum != 9);
	}
	
	
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.nextLine();
		System.out.println("찾으신 회원 검색 결과입니다." + mc.searchId(id));
		
	}
	
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		Member[] result = mc.searchName(name);
		for(int i=0; i<result.length; ++i) {
			if(result[i] != null) {
				System.out.println("찾으신 회원 검색 결과입니다." + result[i].inform());
			}
		}

		
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.nextLine();

		System.out.println("찾으신 회원 검색 결과입니다." + mc.searchEmail(email));
		
	}
	
	public void updateMember() {
		int menuNum;
		do {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				updatePassword();
				break;
			case 2:
				updateName();
				break;
			case 3:
				updateEmail();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}while(menuNum != 9);
	}
	
	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		
		
		
		System.out.print("수정할 비밀번호 : ");
		String password = sc.nextLine();
		if(mc.updatePassword(id, password) == true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		if(mc.updateName(id, name) == true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이메일 : ");
		String email = sc.nextLine();
		if(mc.updateEmail(id, email) == true) {
			System.out.println("수정이 성공적으로 되었습니다");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void deleteMember() {
		int menuNum;
		do {
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");
			
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				deleteOne();
				break;
			case 2:
				deleteAll();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다");
			}
		}while(menuNum != 9);
	}
	
	public void deleteOne() {
		System.out.print("삭제할 id를 입력해주세요 : ");
		String id = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까? (y/n)");
		char yn = sc.nextLine().toUpperCase().charAt(0);
		if(yn == 'Y') {
			mc.delete(id);
			System.out.println("성공적으로 삭제하였습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void deleteAll() {
		
	}
}
