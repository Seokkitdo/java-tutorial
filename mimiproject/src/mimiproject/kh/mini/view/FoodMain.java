package mimiproject.kh.mini.view;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class FoodMain extends JFrame{
	
	public FoodMain() {
		
		setSize(500, 700); //���������� ������
 
		setLayout(null);
	
		setLocationRelativeTo(null); //���������� �����ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel mainTitle = new JLabel("kh�ΰ�"); //���������� ���Ÿ��Ʋ
		mainTitle.setFont(new Font("����", Font.PLAIN, 30)); // ����Ÿ��Ʋ ���� ����
		
		mainTitle.setBounds(190, 50, 500, 50); // ����Ÿ��Ʋ ��ġ
		add(mainTitle);
		
		
		JLabel select_eat_locatio = new JLabel("�Ļ��Ͻ� ��Ҹ� ������ �ּ���");
		select_eat_locatio.setForeground(Color.white);
		select_eat_locatio.setFont(new Font("����", Font.PLAIN, 30)); // ����Ÿ��Ʋ ���� ����
		select_eat_locatio.setFont(select_eat_locatio.getFont().deriveFont(15.0f)); //����Ÿ��Ʋ ����ũ������
		select_eat_locatio.setBounds(150, 150, 500, 50); // ����Ÿ��Ʋ ��ġ
		add(select_eat_locatio);
		
		
		JButton eat_btn = new JButton(); //�ѽĹ�ư
		ImageIcon eating = new ImageIcon("image/eating.png");
		eat_btn.setIcon(eating);
		eat_btn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				new koreanMenu(); 
			} 
		}); 
		eat_btn.setBounds(40, 200, 185, 300); //��ġ����
		eat_btn.setBackground(Color.white);
		add(eat_btn);
		
		
		JButton takeOut_btn = new JButton();
		takeOut_btn.setBounds(255, 200, 185, 300);
		ImageIcon icon = new ImageIcon("image/takeout.jpg");
		
        takeOut_btn.setIcon(icon);

        takeOut_btn.setBackground(Color.white);
		add(takeOut_btn);
		
		

	
		
		JButton manager_btn = new JButton("������");
		manager_btn.setBounds(350, 600, 80, 50);
		manager_btn.setBackground(Color.white);
		add(manager_btn);
		
		getContentPane().setBackground(new Color(0,100,0));
		setVisible(true);
		
	}


	
}
