package com.kh.example.chap02_layout.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame{
	public C_GridLayout() {
		
		super("C_GridLayout");
//		setVisible(true); //웬만하면 아래에 둘것
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 500, 500);
		
		// GridLayout
		// 		가로, 세로의 일정 수만큼 배치하고자 할때 사용
		
		setLayout(new GridLayout(5, 5, 10, 20)); // 3번째 4번째 는 가로, 세로 사이의 간격
		for(int i=1; i<26; i++) {
			String str = new Integer(i).toString();
			add(new JButton(str));
		}
		setVisible(true);
	}
}
