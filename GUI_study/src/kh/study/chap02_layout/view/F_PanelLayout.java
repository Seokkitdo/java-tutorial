package kh.study.chap02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame{
	public F_PanelLayout() {
		super("NullLayout");
		
		setBounds(200, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(null); //layout을 없애는 것
		
		JLabel lb = new JLabel("이름 : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
	
		
		JTextField tf = new JTextField(20);
		tf.setBounds(110, 100, 200, 50);
		
		JButton btn = new JButton("추가");
		btn.setBounds(350,100,100,50);
		
		JPanel panel = new JPanel();
		panel.setSize(500, 500);
		panel.setLayout(null); //패널 기본 레이아웃은 FlowLayout이기 때문에 null로 바꾸어준다
		
		panel.add(btn);
		panel.add(tf);
		panel.add(lb);
		
		add(panel);
		setVisible(true);
	}

}
