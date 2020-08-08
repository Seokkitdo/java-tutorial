package kh.study.chap01_container.view;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameView2 {
	public void showFrame() {
		JFrame frame = new JFrame("My second Frame"); //객체만들기
		//프레임 타이틀은 생성자에 스트링으로 적어주던지 setTitle 메소드를 통해 정할 수 있다
//		frame.setTitle("My Second Frame");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Rectangle r = new Rectangle(300,200,800,500);
		frame.setBounds(r);
		
		frame.setResizable(false); //크기 변경 불가능하게 설정
		
		try {
			frame.setIconImage(ImageIO.read(new File("image/apple.PNG")));
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}
