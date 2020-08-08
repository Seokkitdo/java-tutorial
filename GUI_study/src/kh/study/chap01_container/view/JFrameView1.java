package kh.study.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameView1 extends JFrame{
	public JFrameView1() {
//		setSize(800, 500); //크기지정
//		setTitle("My First Frame"); //프레임의 이름 지정
		super("My First Frame"); //super생성자에 스트링을 넣으면 setTitle과 같다
		setVisible(true); // 화면이 보이도록
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임을 닫았을 때 프로세스도 정상종료되도록
		
//		setLocation(300, 200); //프레임이 나타나는 위치조정
		setBounds(300, 200, 800, 500);
		//setBounds = setSize + setLocation을 더한 프레임이 나온다 .setBounds로 크기지정 및 위치조정 가능
		
		
		try {
			setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
