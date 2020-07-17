package com.kh.example.practice5.model.vo;

public class Lotto {
	private int[] lotto;
	
	{ //초기화 블록
		lotto = new int[6];
		
		for(int i = 0; i<lotto.length; ++i) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			for(int j=0; j <i; ++j) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
	}
	public Lotto() {}
	
	public void information() {
		for(int i=0; i<lotto.length; ++i) {
			if(lotto[i] < 10) {
				System.out.println("0" + lotto[i] + " ");
			}else {
				System.out.println(lotto[i] + " ");
			}
		}
	}
	
}

