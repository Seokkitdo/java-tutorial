package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 extends Parent{
	public Child3() {
		Parent p = new Parent();
		
//		p.dNum = 20; 같은 패키지가 아니기 떄문에 안된다
//		p.bool = false;
		p.ch = 'a';
	}
}
