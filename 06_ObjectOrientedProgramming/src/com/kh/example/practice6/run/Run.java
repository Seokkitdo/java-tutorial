package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book();
		book.inform();
		
		Book book1 = new Book("ÇÏÀÌ", "¾È³ç", "±¸ÅÙÅ¹");
		book1.inform();
		
		Book book2 = new Book("µ·ÀÇ ¼Ó¼º", "½º³ë¿ìÆø½ººÏ½º", "±è½ÂÈ£", 16000, 0.1);
		book2.inform();
	}

}
