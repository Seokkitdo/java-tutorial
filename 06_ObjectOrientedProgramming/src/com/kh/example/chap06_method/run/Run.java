package com.kh.example.chap06_method.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodController;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {

	public static void main(String[] args) {
		MethodController mc = new MethodController();
		mc.method1();
		mc.method2();
		mc.method3(5, 5);
		mc.method4(6, 6);
		int result2 = mc.method4(7, 2);
		System.out.println(mc.method4(6, 6));
		System.out.println(result2);
		
		
		int[] resultArr = mc.method5(); //얕은 복사
		System.out.println("Run resultArr : " + resultArr);
		for(int i =0; i<resultArr.length; ++i) {
			System.out.println(resultArr[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		User resultUser = mc.method6(); //얕은 복사
		System.out.println("Run resultUser : " + resultUser);
		
		Trainee tt = new Trainee();
		System.out.println(tt.inform());
		tt.setName("박신우");
		tt.setClassRoom('G');
		tt.setTime("오후");
		Trainee.setScore(80.0);
		System.out.println(tt.inform());
		
	}

}
