package com.kh.example.chap02_char.model.dao;

import java.awt.Frame;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
		// 파일에 문자 단위 데이터를 저장하고 싶다
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt");
			
			fw.write("와, IO 재밌다");
			fw.write('A');
			fw.write(' ');
	
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void fileSave2() {
		try(FileWriter fw = new FileWriter("b_char.txt");) {
			
			fw.write("try with resource 예시");
			fw.write(' ');
			fw.write('B');
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		// 파일을 문자 단위 데이터로 읽어오고 싶다
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
			int value;
			while((value = fr.read()) != -1) {
				System.out.print((char)value + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen2() {
		try(FileReader fr = new FileReader("b_char.txt");) {
			
			
			int value;
			while((value = fr.read()) != -1) {
				System.out.println(value + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
