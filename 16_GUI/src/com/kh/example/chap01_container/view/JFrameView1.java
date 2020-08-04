package com.kh.example.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameView1 extends JFrame{
	public JFrameView1() {
//		super("이렇게 하는 방법도 있습니다.");// setTitle과 같은 효과
//		this.setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 버튼을 누르면 프로세스도 같이 종료
		
//		setLocation(300, 200);
		//setBounds 는 setSize + setLocation
		setBounds(300, 200, 800, 500);
		
		setTitle("My First Frame");
		
		try {
			setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setResizable(false); //사이즈 조정 불가
	}
}
