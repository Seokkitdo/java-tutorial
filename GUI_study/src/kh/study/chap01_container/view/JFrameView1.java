package kh.study.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameView1 extends JFrame{
	public JFrameView1() {
//		setSize(800, 500); //ũ������
//		setTitle("My First Frame"); //�������� �̸� ����
		super("My First Frame"); //super�����ڿ� ��Ʈ���� ������ setTitle�� ����
		setVisible(true); // ȭ���� ���̵���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�������� �ݾ��� �� ���μ����� ��������ǵ���
		
//		setLocation(300, 200); //�������� ��Ÿ���� ��ġ����
		setBounds(300, 200, 800, 500);
		//setBounds = setSize + setLocation�� ���� �������� ���´� .setBounds�� ũ������ �� ��ġ���� ����
		
		
		try {
			setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
