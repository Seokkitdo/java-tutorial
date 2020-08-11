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
		
		setSize(500, 700); //메인프레임 사이즈
 
		setLayout(null);
	
		setLocationRelativeTo(null); //메인프레임 가운데배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel mainTitle = new JLabel("kh로고"); //메인프레임 상단타이틀
		mainTitle.setFont(new Font("돋움", Font.PLAIN, 30)); // 메인타이틀 글자 굵게
		
		mainTitle.setBounds(190, 50, 500, 50); // 메인타이틀 위치
		add(mainTitle);
		
		
		JLabel select_eat_location = new JLabel("식사하실 장소를 선택해 주세요");
		select_eat_location.setForeground(Color.white);
		select_eat_location.setFont(new Font("돋움", Font.PLAIN, 30)); // 메인타이틀 글자 굵게
		select_eat_location.setFont(select_eat_location.getFont().deriveFont(15.0f)); //메인타이틀 글자크기조정
		select_eat_location.setBounds(150, 150, 500, 50); // 메인타이틀 위치
		add(select_eat_location);
		
		
		JButton eat_btn = new JButton(); //한식버튼
		ImageIcon eating = new ImageIcon("image/eating.png");
		eat_btn.setIcon(eating);
		eat_btn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				new koreanMenu(); 
			} 
		}); 
		eat_btn.setBounds(40, 200, 185, 300); //위치조정
		eat_btn.setBackground(Color.white);
		add(eat_btn);
		
		
		JButton takeOut_btn = new JButton();
		takeOut_btn.setBounds(255, 200, 185, 300);
		takeOut_btn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				new koreanMenu(); 
			} 
		}); 
		ImageIcon icon = new ImageIcon("image/takeout.jpg");
		
        takeOut_btn.setIcon(icon);

        takeOut_btn.setBackground(Color.white);
		add(takeOut_btn);
		
		

	
		
		JButton manager_btn = new JButton("관리자");
		manager_btn.setBounds(350, 600, 80, 50);
		manager_btn.setBackground(Color.white);
		add(manager_btn);
		
		getContentPane().setBackground(new Color(0,100,0));
		setVisible(true);
		
	}


	
}
