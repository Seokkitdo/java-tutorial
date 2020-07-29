package com.kh.example.chap03_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.example.chap03_assist.part02_object.model.vo.Member;

public class ObjectDAO {
	public void fileSave() {
		Member[] mar = {new Member("user01", "pass01", "���ǰ�", "kang123@kh.or.kr", 25, '��', 1250.8),
						new Member("user02", "pass02", "�ش���", "hae456@kh.or.kr", 16, '��', 1211.5),
						new Member("user03", "pass03", "���밭", "do789@kh.or.kr", 22, '��', 1111.2)};
		
		
		
		// ��ü�� ���Ͽ� �����ϰ� ����
		// --- --> ��ü�� ���õ� ������Ʈ�� �ʿ� : ObjectInputStream, ObjectOutputStream
		//			--- --> ����� ���õ� ��Ʈ�� �ʿ� : ObjectOutputStream(Ȯ��)
		//		-------- --> ���� ����� ���õ� ��Ʈ�� �ʿ� : FileInputStream, FileOutputStream, FileReader, FileWriter
		//			------>���� ����� ���õ� ��Ʈ�� : FileOutputStream(Ȯ��)
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.txt"));) {
//			FileOutputStream fos = new FileOutputStream("f_object.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			for(int i=0; i<mar.length; ++i) {
				oos.writeObject(mar[i]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		// ���Ͽ� ����� ��ü�� �о���� ����
		// 			 ------ -->ObjectInputStream
		// ------>FileInputStream
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"));){
//			FileInputStream fis = new FileInputStream("d_object.txt");
//			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Member[] mar = new Member[3];
			for(int i=0; i<mar.length; i++) {
				mar[i] = (Member)ois.readObject();
			}
			
			for(Member m : mar) {
				System.out.println(m);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
