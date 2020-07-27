package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] p = new Phone[2];
		p[0] = new GalaxyNote9();
		p[1] = new V40();
		
		for(int i=0; i<p.length; ++i) {
			if(p[i] instanceof GalaxyNote9) {
//				((GalaxyNote9)p).touch();
			}
		}
		return result;
	}
	
	
//	Parent[] pArr = new Parent[4];
//	pArr[0] = new Child1();
//	pArr[1] = new Child2();
//	pArr[2] = new Child2();
//	pArr[3] = new Child1();
//	
//	for(int i=0; i<pArr.length; ++i) {
//////		pArr[i].printParent();
////		if(pArr[i] instanceof Child1) {
////			((Child1)pArr[i]).printChild1();
////		} else if(pArr[i] instanceof Child2) {
////			((Child2)pArr[i]).printChild2();
////		}
//		
//		pArr[i].print();
//	}
}
