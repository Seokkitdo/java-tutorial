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
//		getContentPane().setLayout(null); 
		setLayout(null);
//		JPanel panel = new JPanel(); // 패널 객체생성
//		frame.getContentPane().setLayout(null);
		setLocationRelativeTo(null); //메인프레임 가운데배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel mainTitle = new JLabel("kh로고"); //메인프레임 상단타이틀
		mainTitle.setFont(new Font("돋움", Font.PLAIN, 30)); // 메인타이틀 글자 굵게
		
		mainTitle.setBounds(190, 50, 500, 50); // 메인타이틀 위치
		add(mainTitle);
		
		
		JLabel select_eat_locatio = new JLabel("식사하실 장소를 선택해 주세요");
		select_eat_locatio.setForeground(Color.white);
		select_eat_locatio.setFont(new Font("돋움", Font.PLAIN, 30)); // 메인타이틀 글자 굵게
		select_eat_locatio.setFont(select_eat_locatio.getFont().deriveFont(15.0f)); //메인타이틀 글자크기조정
		select_eat_locatio.setBounds(150, 150, 500, 50); // 메인타이틀 위치
		add(select_eat_locatio);
		
		
		JButton kfood_btn = new JButton(); //한식버튼
		ImageIcon eating = new ImageIcon("image/eating.png");
		kfood_btn.setIcon(eating);
		kfood_btn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) { 
				new koreanMenu(); 
			} 
		}); 
		kfood_btn.setBounds(40, 200, 185, 300); //위치조정
		kfood_btn.setBackground(Color.white);
		add(kfood_btn);
		
		
		JButton takeOut_btn = new JButton();
		takeOut_btn.setBounds(255, 200, 185, 300);
		ImageIcon icon = new ImageIcon("image/takeout.jpg");
		
        takeOut_btn.setIcon(icon);
//        int offset = takeOut.getInsets().left;
//        takeOut.setIcon(resizeIcon(icon, takeOut.getWidth() - offset, takeOut.getHeight() - offset));
        takeOut_btn.setBackground(Color.white);
		add(takeOut_btn);
		
		

//		
		
		JButton manager_btn = new JButton("관리자");
		manager_btn.setBounds(350, 600, 80, 50);
		manager_btn.setBackground(Color.white);
		add(manager_btn);
		
		getContentPane().setBackground(new Color(0,100,0));
		setVisible(true);
		
	}

//	private Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
//		Image img = icon.getImage();  
//	    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
//	    return new ImageIcon(resizedImage);
//	}
	
}
