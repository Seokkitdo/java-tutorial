package kh.study.chap02_layout.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame{
	public B_FlowLayout() {
		super("B_FlowLayout");
		
		setBounds(300, 200, 800, 500);
		;
		
		// FlowLayout
		// 왼쪽에서 오른쪽으로 흐르듯이 컴포넌트가 배치되는 레이아웃
		
		setLayout(new FlowLayout());
		add(new JButton("1번"));
		add(new JButton("2번"));
		add(new JButton("2번"));
		add(new JButton("2번"));
		add(new JButton("2번"));
		add(new JButton("2번"));
		add(new JButton("2번"));
		add(new JButton("2번"));
		add(new JButton("2번"));
		add(new JButton("2번"));
		add(new JButton("2번"));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
