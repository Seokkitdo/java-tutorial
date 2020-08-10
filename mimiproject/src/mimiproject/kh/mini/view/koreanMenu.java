package mimiproject.kh.mini.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class koreanMenu implements MouseListener{

	public koreanMenu() {
		// 디자인단
        // 프레임 설정단
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setSize(1300, 800);
		
		
		JLabel Title = new JLabel("KH음식점"); //메인프레임 상단타이틀
		Title.setFont(new Font("돋움", Font.PLAIN, 30)); // 메인타이틀 글자 굵게
		
		Title.setForeground(Color.white);
		Title.setBounds(600, 20, 500, 40);
		frame.add(Title);
				
		
		JButton kfood_btn = new JButton("한식");
		kfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		kfood_btn.setBackground(new Color(0, 14, 39));
		kfood_btn.setForeground(Color.WHITE);
		kfood_btn.setBounds(45, 91, 161, 59);
		frame.add(kfood_btn);
		
		JButton cfood_btn = new JButton("중식");
		cfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		cfood_btn.setForeground(Color.WHITE);
		cfood_btn.setBounds(218, 91, 161, 59);
		cfood_btn.setBackground(new Color(0, 14, 39));
		frame.add(cfood_btn);
		
		JButton wfood_btn = new JButton("양식");
		wfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		wfood_btn.setForeground(Color.WHITE);
		wfood_btn.setBounds(391, 91, 161, 59);
		wfood_btn.setBackground(new Color(0, 14, 39));
		frame.add(wfood_btn);
		
		JButton jfood_btn = new JButton("일식");
		jfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		jfood_btn.setForeground(Color.WHITE);
		jfood_btn.setBounds(564, 91, 161, 59);
		jfood_btn.setBackground(new Color(0, 14, 39));
		frame.add(jfood_btn);
		
		JButton btn_0 = new JButton("음식 1");
		btn_0.setBounds(45, 199, 202, 187);
		frame.add(btn_0);
		
		JButton btn_1 = new JButton("음식 2");
		btn_1.setBounds(269, 199, 202, 187);
		frame.add(btn_1);
		
		JButton btn_2 = new JButton("음식 3");
		btn_2.setBounds(495, 199, 202, 187);
		frame.add(btn_2);
		
		JButton btn_3 = new JButton("음식 4");
		btn_3.setBounds(45, 438, 202, 187);
		frame.add(btn_3);
		
		JButton btn_4 = new JButton("음식 5");
		btn_4.setBounds(269, 438, 202, 187);
		frame.add(btn_4);
		
		JButton btn_5 = new JButton("음식 6");
		btn_5.setBounds(495, 438, 202, 187);
		frame.add(btn_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(245,242,237));
		textArea.setBounds(811, 180, 439, 450);
		frame.add(textArea);
		
		
		
		
		
		kfood_btn.addMouseListener(this);
		cfood_btn.addMouseListener(this);
		wfood_btn.addMouseListener(this);
		jfood_btn.addMouseListener(this);
		
		
		
		frame.getContentPane().setBackground(new Color(37, 23, 22)); //frame 색상지정
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton b = (JButton)e.getSource();
        b.setBackground(new Color(223,195,130));
        b.setForeground(Color.black);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b = (JButton)e.getSource();
        b.setBackground(new Color(223,195,130));
        b.setForeground(Color.black);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton b = (JButton)e.getSource();
        b.setBackground(new Color(0, 14, 39));
        b.setForeground(Color.white);
	
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
