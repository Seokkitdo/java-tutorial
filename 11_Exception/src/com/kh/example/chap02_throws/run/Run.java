package com.kh.example.chap02_throws.run;

import com.kh.example.chap02_throws.controller.ThrowsController;

public class Run {

	public static void main(String[] args) /* throws Exception */ {
		ThrowsController tc = new ThrowsController();
		
		try {
			tc.method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			//경고를 알려주는 것 : printStackTrace
			System.out.println("예외 상황이 발생했습니다.");
		}
		
		System.out.println("정상적으로 종료됨...");
	}

}
