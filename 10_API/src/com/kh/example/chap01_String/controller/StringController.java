package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		System.out.println("str1�� str2�� �ּҴ� ������? : " + (str1 == str2));
		System.out.println("str1�� str3�� �ּҴ� ������? : " + (str1 == str3));
		System.out.println();
		// hashCode() //������Ʈ�� �ִ� �޼ҵ�
		// equals �� ���� ���� ���� ������ �ؽð��� ����
		System.out.println("str1�� hashcode : " + str1.hashCode());
		System.out.println("str2�� hashcode : " + str2.hashCode());
		System.out.println("str3�� hashcode : " + str3.hashCode());
		System.out.println();
		//SystemŬ������ identityHashCode()
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
		System.out.println();
		str2 += "oracle";
		System.out.println("str1�� hashCode : " + str1.hashCode());
		System.out.println("str2�� hashCode : " + str2.hashCode());
		System.out.println("str3�� hashCode : " + str3.hashCode());
		System.out.println();
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
	}
	public void method2() {
		// StringBuffer
		// String�� �̿��ؼ� � ���ڿ� �۾��� �� �� StringŬ���� ��ü ������ ���ؼ� �ϰų� ���ͷ��� �۾��߾���
		// ����ؼ� ���ڿ� ���� �����ؾ��ϴ� ��� StringŬ������ Ư¡�� �Һ� ������ 
		// ���� ���� ����� ���� ��ġ�� �ٲ��ֱ� ������ �������÷��Ͱ� ��� �������Ѵٴ� ������ ����
		// ������ ���� �б⸸ ���� ��쿡�� �Һ� Ŭ������ StringŬ������ �� ����
		
		// �����ؾ��ϴ� ���� ���� ��쿡�� StringBuffer �� StringBuilder�� �ϴ°� ����
		// StringBuffer�� StringBuilder�� ���ܿ��� ������ ���� �޸� ����(����)�� ���ο� ���ϴµ�
		// ó������ 16���� ���ڸ� ������ �� �ִ� ���۰� �����ǰ� ���ڰ� ����ʿ� ���� �ڵ����� ������
		// �ʱ� ���� ũ�⸦ ������ ���� �ְ� ���ڿ��� ���̺��� 16���� ���ڸ� �� ������ �� ����
		// �� Ŭ������ �� ���������� ����ȭ�� �Ǵ��� �ȵǴ����� ���̸� ����(������ safe)
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("�ʱ� buffer1�� ���뷮 : " + buffer1.capacity());
		System.out.println("buffer1�� ����ִ� ���� ���� ���� : " + buffer1.length());
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("�ʱ� buffer2�� ���뷮 : " + buffer2.capacity());
		System.out.println("buffer2�� ����ִ� ���� ���� ���� : " + buffer2.length());
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("�ʱ� buffer3�� ���뷮 : " + buffer3.capacity());
		System.out.println("buffer3�� ����ִ� ���� ���� ���� : " + buffer3.length());
		System.out.println();
		
		System.out.println("buffer3�� ���ּҰ�: " + System.identityHashCode(buffer3));
		buffer3.append("abc");
		System.out.println("abc �߰� ���� buffer3 : " + buffer3);
		System.out.println("abc �߰� ���� buffer3�� �뷮 : " +buffer3.capacity());
		System.out.println("abc �߰� ���� buffer3�� ���� " + buffer3.length());
		
		buffer3.append("def");
		System.out.println("abc �߰� ���� buffer3 : " + buffer3);
		System.out.println("abc �߰� ���� buffer3�� �뷮 : " +buffer3.capacity());
		System.out.println("abc �߰� ���� buffer3�� ���� " + buffer3.length());
		
		// insert(int offset, String str) ��ȯ�� : StringBuffer
		buffer3.insert(2, "zzz");
		System.out.println("zzz �߰� ���� buffer3 : " + buffer3);
		System.out.println("zzz �߰� ���� buffer3�� �뷮 : " +buffer3.capacity());
		System.out.println("zzz �߰� ���� buffer3�� ���� " + buffer3.length());
		
		buffer3.reverse();
		System.out.println("reverse �߰� ���� buffer3 : " + buffer3);
		
		//delete(int start, int end)��ȯ�� StringBuffer
		// start <=index <end   ���۰��̻� �����̸�
		buffer3.delete(2,5);
		System.out.println("delete ���� buffer3 : " + buffer3);
		
		
		StringBuffer sb = new StringBuffer("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
		System.out.println(sb);
	}
	
	public void method3() {
		String str = "Hello World";
		
		// 1.charAt()
		
		// 2.concat() �Ű����� �ٿ��ִ� ����
		String concatStr = str.concat("!!!");
		System.out.println(concatStr);
		str += "!!!";
		System.out.println(str);
		
		// 3.equals()
		
		// 4.substring(int beginIndex) �Ű����� ������ �ε��� ���ĺ��� ���
		//			  (int beginIndex, int endIndex)
		System.out.println("str.substring(6) : " + str.substring(1));
		
		// 5. toUpperCase, toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		// 6.equalsIgnoreCase   //��ҹ��� ������ ���� �� ��
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println(str2.equalsIgnoreCase(str3));
		
		// 7.trim() �յڿ� �ִ� �� ������ �������ִ� �޼ҵ�
		String str4 = "     Java";
		String str5 = "Java       ";
		String str6 = "     ja    va";
		
		System.out.println(str4 + " : " + str4.trim());
		System.out.println(str4 + " : " + str4.trim() + "!");
		System.out.println(str6 + " : " + str6.trim() + "!");
		
		//8.split()
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] strArr = splitStr.split(", ");
		for(int i=0; i<strArr.length; ++i) {
			System.out.println(strArr[i]);
		}
		
		for(String elem : strArr) {
			System.out.println(elem);
		}
	}
	
	public void method4() {
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer st = new StringTokenizer(str, ", ");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) { //�� ������ ��ū�� �ִٸ� �� ��ū�� ������ �������
			System.out.println(st.nextToken());
		}
		
		String str2 = "Apple,Banana_Cream*Dessert#Egg Fruit";
		StringTokenizer st2 = new StringTokenizer(str2, ",_*# ");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
