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
		
//		ac.balance -= 2000000; //ĸ��ȭ�� �ȵǾ��ֱ� ������ �ܺο��� ������ ��
//		ac.balance -= 2000000; //ĸ��ȭ(private)�� �ϰԵǸ� �ܺο��� ������ �Ұ����ϹǷ� ������ ��
		
		ac.withdraw(500000);
		ac.displayBalance();
	}
}
