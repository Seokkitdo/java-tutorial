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
		// �����δ�
        // ������ ������


		JLabel Title = new JLabel("KH�н�"); //���������� ���Ÿ��Ʋ
		Title.setFont(new Font("����", Font.PLAIN, 30)); // ����Ÿ��Ʋ ���� ����
		
		Title.setForeground(Color.white);
		Title.setBounds(600, 10, 500, 40);
		add(Title);
				

		getContentPane().setBackground(new Color(37, 23, 22)); //frame ��������
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
    }
	
}
