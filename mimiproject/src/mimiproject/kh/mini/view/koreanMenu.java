package mimiproject.kh.mini.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class koreanMenu extends JFrame{
	
	public koreanMenu() {
		// 디자인단
        // 프레임 설정단


		JLabel Title = new JLabel("KH분식"); //메인프레임 상단타이틀
		Title.setFont(new Font("돋움", Font.PLAIN, 30)); // 메인타이틀 글자 굵게
		
		Title.setForeground(Color.white);
		Title.setBounds(600, 10, 500, 40);
		add(Title);
				

		getContentPane().setBackground(new Color(37, 23, 22)); //frame 색상지정
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
    }
	
}
