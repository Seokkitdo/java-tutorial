package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr1 = new int[10];
		for(int i =0; i<arr1.length; ++i) {
			
			arr1[i] = i+1;
			System.out.print(arr1[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr1 = new int[10];
		for(int i =0; i<arr1.length; ++i) {
			arr1[i] = 10 - i;
			System.out.print(arr1[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for(int i =0; i<arr1.length; ++i) {
			arr1[i] = i+1;
			System.out.print(arr1[i] + " ");
		}
	}
	
	public void practice4() {
		String[] fruits = new String[5];
		fruits[0] = "���";
		fruits[1] = "��";
		fruits[2] = "����";
		fruits[3] = "������";
		fruits[4] = "����";
		
		System.out.println(fruits[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] sarr = new char[str.length()];
		for(int i=0; i<sarr.length; ++i) {
			sarr[i] = str.charAt(i);	
		}
		
		System.out.print("���� : ");
		String str2 = sc.nextLine();
		char ch = str2.charAt(0);
		
		int count = 0;
		for(int i =0; i<sarr.length; ++i) {
			if(sarr[i] == ch) {
				count++;
				System.out.print(i + " ");
			}
		}System.out.println();
		System.out.println("i ���� : " + count);
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] days = new String[] {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"};
		System.out.print("0 ~ 6���� ���� �Է� : ");
		int num1 = sc.nextInt();
		
		
		switch(num1) {
		case 0:
			System.out.println(days[0]);
			break;
		case 1:
			System.out.println(days[1]);
			break;
		case 2:
			System.out.println(days[2]);
			break;
		case 3:
			System.out.println(days[3]);
			break;
		case 4:
			System.out.println(days[4]);
			break;	
		case 5:
			System.out.println(days[5]);
			break;
		case 6:
			System.out.println(days[6]);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
	}
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����  : ");
		int num = sc.nextInt();
		int[] iarr = new int[num];
		
		for(int i =0; i<iarr.length; ++i) {
			System.out.print("�迭 "+i+"��° �ε����� ���� �� : ");
			int input = sc.nextInt();
			iarr[i] = input;
		}
		
		for(int i =0; i<iarr.length; ++i) {
			System.out.print(iarr[i] + " ");
		}
		
		int sum = 0;
		
		System.out.println();
		
		for(int i=0; i<iarr.length; ++i) {
			sum += iarr[i];
		}
		System.out.println("���� : " + sum);
	}
	
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] iarr = new int[num];
		if(num >=3 && num % 2 == 1) {
			for(int i =0; i<iarr.length; ++i) {
				if(i + 1 <= (iarr.length / 2) + 1) {
					iarr[i] = i+1;
				}else {
					iarr[i] = iarr[i-1]-1; 
				}

				System.out.print(iarr[i] + " ");
			}

		}else {
			System.out.println("�ٽ� �Է��ϼ���.");
			practice8();
		}
	}
	
	
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chiken = sc.nextLine();
		
		String[] chikenarr = new String[] {"���", "�Ķ��̵�", "���߹ٻ��"};
		
		for(int i =0; i<chikenarr.length; ++i) {
			if(chiken.equals(chikenarr[i])) {
				System.out.println(chiken+"ġŲ ��� ����");
				break;
			}else {
				System.out.println(chiken+"ġŲ�� ���� �޴��Դϴ�");
				break;
			}
		}
		
	}
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String number = sc.nextLine();
		
		char[] cnumber = new char[number.length()];
		for(int i =0; i<cnumber.length; ++i) {
			cnumber[i] = number.charAt(i);
		}
		
		char[] copy = new char[cnumber.length];
		for(int i=0; i<copy.length; ++i) {
			copy[i] = cnumber[i];
		}
		
		for(int i=0; i<copy.length; ++i) {
			if(i <= 7) {
				System.out.print(copy[i]);
			}else {
				System.out.print("*");
			}
		}
	}
	

	
	public void practice11() {
	      int[] arr = new int[10];
	      for(int i =0; i<arr.length; ++i) {
	         arr[i] = (int)(Math.random() * 10 + 1);
	         
	         System.out.print(arr[i]+ " ");
	      }
	   }
	
	
	public void practice12() {
		int[] arr = new int[10];
	      for(int i =0; i<arr.length; ++i) {
	         arr[i] = (int)(Math.random() * 10 + 1);
	         
	         System.out.print(arr[i]+ " ");
	      }
	      System.out.println();
	      int max = arr[0];
	      int min = arr[0];
	      for(int i=0; i<arr.length; ++i) {
	    	  if(arr[i] > max) {
	    		  max = arr[i];
	    	  } if(arr[i] <min) {
	    		  min = arr[i];
	    	  }
	      }
	      System.out.println("�ִ밪 : " + max);
	      System.out.println("�ּҰ� : " + min);
	}
	
	
	
	public void practice13() {
		int[] arr = new int[10];
	      for(int i =0; i<arr.length; ++i) {
	         arr[i] = (int)(Math.random() * 10 + 1);
	         for(int j=0; j< i; ++j) {
	        	 if(arr[i] == arr[j]) {
	        		 i--;
	        	 }
	         }  
	      }
	      for(int i=0; i<arr.length;++i) {
	    	  System.out.print(arr[i] + " ");
	      }
	}
	
	
	
	public void practice14() {
		int[] arr = new int[10];
	      for(int i =0; i<arr.length; ++i) {
	         arr[i] = (int)(Math.random() * 10 + 1);
	         for(int j=0; j< i; ++j) {
	        	 if(arr[i] == arr[j]) {
	        		 i--;
	        	 }
	         }  
	      }
	      
	      
	      
	      for(int i=0; i<arr.length; ++i) {
	    	  for(int j= i+1; j<arr.length; ++i) {
	    		  if(arr[i] > arr[j]) {
		    		  int temp;
		    		  temp = arr[j];
		    		  arr[i] = arr[j];
		    		  arr[j] = temp;
		    	  } else {
		    		  break;
		    	  }
	    	  }
	    	  
	      }
	      
	      for(int i=0; i<arr.length;++i) {
	    	  System.out.print(arr[i] + " ");
	      }
	}
}
