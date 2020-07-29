package com.kh.example.chap03_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDAO {
	public void output() {
		try (FileWriter fw = new FileWriter("c_buffer.txt");
				BufferedWriter bw = new BufferedWriter(fw);){
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("저리가세요\n");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void input() {
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));){
//			FileReader fr = new FileReader("c_buffer.txt");
//			BufferedReader br = new BufferedReader(fr);
			
			//아래 위 코드는 같은 의미
//			BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));
			String value;
			while ((value = br.readLine()) != null) {
				System.out.println(value);
				
			}
			br.readLine();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
