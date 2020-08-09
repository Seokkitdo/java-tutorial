package mimiproject.kh.mini.view;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class FoodMain extends JFrame{
	
	public FoodMain() {
		
		setSize(500, 700); //메인프레임 사이즈
		getContentPane().setLayout(null); 
//		JPanel panel = new JPanel(); // 패널 객체생성
//		frame.getContentPane().setLayout(null);
		setLocationRelativeTo(null); //메인프레임 가운데배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel mainTitle = new JLabel("***** 푸드코트입니다 *****"); //메인프레임 상단타이틀
		mainTitle.setFont(new Font("Serif", Font.BOLD, 11)); // 메인타이틀 글자 굵게
		mainTitle.setFont(mainTitle.getFont().deriveFont(30.0f)); //메인타이틀 글자크기조정
		mainTitle.setBounds(50, 50, 500, 50); // 메인타이틀 위치
		getContentPane().add(mainTitle); //메인타이틀 프레임에 추가
		
		JButton kfood_btn = new JButton("한식입니다"); //한식버튼
		getContentPane().add(kfood_btn); 
		kfood_btn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) { 
				new koreanMenu(); 
			} 
		}); 
		kfood_btn.setBounds(150, 150, 200, 50); //위치조정
		getContentPane().add(kfood_btn); // 프레임에 위치추가
		
		
		JButton wfood_btn = new JButton("양식입니다");
		wfood_btn.setBounds(150, 250, 200, 50);
		getContentPane().add(wfood_btn);
		
		
		JButton cfood_btn = new JButton("중식입니다");
		cfood_btn.setBounds(150, 350, 200, 50);
		getContentPane().add(cfood_btn);
		
		
		JButton manager_btn = new JButton("관리자");
		manager_btn.setBounds(150, 500, 200, 50);
		getContentPane().add(manager_btn);
		
		
		
		
		
//		Dialog dialog = new Dialog(frame,"한식");
//		dialog.setBounds(0, 0, 625, 1000);
//		JLabel koreaFood = new JLabel("한식메뉴");
//		koreaFood.setHorizontalAlignment(JLabel.CENTER);
//		
//		dialog.add(koreaFood, "North");
//		
//		kfood_btn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dialog.setVisible(true);
//			}
//		});
//		
//		JButton close_btn = new JButton("close");
//		close_btn.setBounds(0, 0, 50, 50);
////		dialog.add(close_btn);
////		
//		close_btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				dialog.dispose();
//			}
//		});
		
		
	
	
		
//		frame.add(panel);
		
		setVisible(true);
		
	}
	
}
