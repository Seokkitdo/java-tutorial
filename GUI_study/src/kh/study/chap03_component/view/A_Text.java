package kh.study.chap03_component.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_Text {
	public A_Text() {
		JFrame frame = new JFrame("Text");
		frame.setSize(800, 300);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		panel.setSize(800, 300);
		
		JTextField id = new JTextField(30);
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		JPasswordField password = new JPasswordField(30);
		panel.add(new JLabel("PASSWORD"));
		panel.add(password);
		
		JTextArea textArea = new JTextArea(10,30);
//		textArea.setEditable(false);
		
		JButton btn = new JButton("º¸³»±â");
		panel.add(btn);
		
		frame.add(panel, BorderLayout.NORTH);
		frame.add(textArea, BorderLayout.CENTER);
		frame.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id = " + id.getText() + "\n";
				id.setText("");
				
				String showPwd = "";
				char[] pwdArr = password.getPassword();
				for(int i=0; i<pwdArr.length; i++) {
					showPwd += pwdArr[i]+"";
				}
				
				text += "password = " + showPwd + "\n";
				password.setText("");
				
				textArea.append(text);
				id.requestFocus();
				
			}
		});
		
		
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
