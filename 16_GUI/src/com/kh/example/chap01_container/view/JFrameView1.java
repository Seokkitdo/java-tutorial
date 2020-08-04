package com.kh.example.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameView1 extends JFrame{
	public JFrameView1() {
//		super("�̷��� �ϴ� ����� �ֽ��ϴ�.");// setTitle�� ���� ȿ��
//		this.setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // �ݱ� ��ư�� ������ ���μ����� ���� ����
		
//		setLocation(300, 200);
		//setBounds �� setSize + setLocation
		setBounds(300, 200, 800, 500);
		
		setTitle("My First Frame");
		
		try {
			setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setResizable(false); //������ ���� �Ұ�
	}
}
