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
		// ���ʿ��� ���������� �帣���� ������Ʈ�� ��ġ�Ǵ� ���̾ƿ�
		
		setLayout(new FlowLayout());
		add(new JButton("1��"));
		add(new JButton("2��"));
		add(new JButton("2��"));
		add(new JButton("2��"));
		add(new JButton("2��"));
		add(new JButton("2��"));
		add(new JButton("2��"));
		add(new JButton("2��"));
		add(new JButton("2��"));
		add(new JButton("2��"));
		add(new JButton("2��"));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
