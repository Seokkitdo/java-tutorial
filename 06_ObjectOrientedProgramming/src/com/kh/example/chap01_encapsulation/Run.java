package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account ac = new Account();
		
		ac.displayBalance();
		
		ac.deposit(1000000);
		ac.displayBalance();
		
		ac.deposit(1500000);
		ac.displayBalance();
		
		ac.withdraw(500000);
		ac.displayBalance();
		
//		ac.balance -= 2000000; //캡슐화가 안되어있기 때문에 외부에서 접근한 것
//		ac.balance -= 2000000; //캡슐화(private)를 하게되면 외부에서 접근이 불가능하므로 에러가 뜸
		
		ac.withdraw(500000);
		ac.displayBalance();
	}
}
