package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book();
		book.inform();
		
		Book book1 = new Book("����", "�ȳ�", "����Ź");
		book1.inform();
		
		Book book2 = new Book("���� �Ӽ�", "����������Ͻ�", "���ȣ", 16000, 0.1);
		book2.inform();
	}

}
