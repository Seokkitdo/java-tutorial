package com.kh.example.chap03.branch;

public class B_Continue {
	// �ݺ��� �ȿ����� ��� ����
	// continue�� �Ʒ��� ������ �������� ���� ���� �ܰ�� �ǳ� �ٶ�� �ǹ�
	
	public void method1() {
		// 1~100������ ���� �հ� ���, �� 4�� ����� ���� ���
		
		int sum = 0;
		for(int i =0; i<= 100; ++i) {
			if(i % 4 == 0) {
				continue;
			}
			else {   //else ���� ����
				sum += i;
			}
			
			System.out.print(i + " ");
			
		}System.out.println();
		System.out.println(sum);
	}
	
	public void method2() {
		// ¦�� ��, ¦�� ���� �� ������ ���
		for(int i = 2; i<=9; ++i) {
			for(int j = 1; j<=9; ++j) {
				if(j % 2 == 0 || i % 2 ==0) {
					continue;
				}
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
