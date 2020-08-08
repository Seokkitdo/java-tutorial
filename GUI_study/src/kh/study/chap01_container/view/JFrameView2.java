package kh.study.chap01_container.view;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameView2 {
	public void showFrame() {
		JFrame frame = new JFrame("My second Frame"); //��ü�����
		//������ Ÿ��Ʋ�� �����ڿ� ��Ʈ������ �����ִ��� setTitle �޼ҵ带 ���� ���� �� �ִ�
//		frame.setTitle("My Second Frame");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Rectangle r = new Rectangle(300,200,800,500);
		frame.setBounds(r);
		
		frame.setResizable(false); //ũ�� ���� �Ұ����ϰ� ����
		
		try {
			frame.setIconImage(ImageIO.read(new File("image/apple.PNG")));
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}
