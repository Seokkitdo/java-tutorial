package com.kh.operator;

public class C_Arithmetic {
	public void method() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 : " + (num1 + num2));
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 * num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		double a = 35;
		double b = 10;
		
		System.out.println("a + b = : " + (a + b));
		System.out.println("a - b = : " + (a - b));
		System.out.println("a * b = : " + (a * b));
		System.out.println("a / b = : " + (a / b));
		System.out.println("a % b = : " + (a % b));
		
		
		
	}
	public void test() {
		int a = 5;  //5
		int b = 10;    //10
		
		int c = (++a) + b;  
		//a = 6  b = 10  c = 16    
		int d = c /a; 
		// 16 / 6 = 2   d= 2
		int e = c % a; 
		// 16 % 6 = 4  e = 4
		int f = e++; 	
		// f = 4  e = 5
		int g = (--b) + (d--); 
		// g = 11    d = 1 b = 9
		int h = 2;  
		//h = 2
		
		//a=6  b=9  c=16 d=1 e=5 f=4 g=11 h=1 
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		//      6 + 9 / (15/4) * (11-1) % ( 6+2)
		//      a=7 b=10 c=15 d=1 e=6 f=4 g=10 h=2
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
	}
}
