package com.kh.example.chap01_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
   public void fileOpen() {
      FileInputStream fis=null;
      
      
      try {
         // ���Ͽ� ����Ʈ ������ �����͸� �о���� �ʹ�
         fis = new FileInputStream("a_byte.txt");
         
         
//         //1.  �迭�� ����Ͽ� �迭�� �����Ͽ� �о����
//         int fileSize = (int)new File("a_byte.txt").length();
//         byte[] bArr = new byte[fileSize];
//         fis.read(bArr);
//         for(int i=0; i<bArr.length; i++) {
////            System.out.print(bArr[i] + " ");
//            System.out.print((char)bArr[i] + " ");
//         }
         
          // 2.�迭 ���� ������� �ʰ� �о����
            int value;
            while((value=fis.read()) != -1) {
               System.out.print((char)value + " ");
            }
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         } finally {
            try {
               fis.close();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
         
      }

   
   public void fileOpen2() {
	   try (FileInputStream fis = new FileInputStream("a_byte.txt")){
		
		   int value;
		   while ((value = fis.read()) != -1) {
			System.out.println((char)value +  " ");
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
   }
   
   public void fileSave() {
      FileOutputStream fos = null;
      try {
         //���Ͽ� ����Ʈ ������ �����͸� �����ϰ� �ʹ�.
//         FileOutputStream fos = new FileOutputStream("a_byte.txt");
         fos = new FileOutputStream("a_byte.txt");
         
         fos.write(97);
         
         byte[] bArr = {98,99,100,101,102,103};
//                     b,c,d,e,f,g
         fos.write(bArr);
         
         fos.write(bArr,1,3); // 1 index���� 3��

      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            fos.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
      
   }
   
   
   public void fileSave2() {
	   try (FileOutputStream fos = new FileOutputStream("a_byte.txt");){
		
         fos.write(97);
         
         byte[] bArr = {98,99,100,101,102,103};
//	                     b,c,d,e,f,g
         fos.write(bArr);
         
         fos.write(bArr,1,3); // 1 index���� 3��
         
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
   }
}